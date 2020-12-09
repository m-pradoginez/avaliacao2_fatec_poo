package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaceOpcoes extends JFrame implements ActionListener {
    protected Dimension dLabel, dTextField, dButton, dTextArea, dFrame;
    protected Label lblFunc, lblValor, lblCargo;
    protected TextField txtFunc, txtValor, txtCargo;
    protected Button btnAumento, btnPromocao, btnConsulta, btnDemetir;
    protected TextArea msgBox;
    protected Funcionario funcionario;

    public interfaceOpcoes(){
        funcionario = new Funcionario();
       dFrame = new Dimension(350,400);
       dLabel = new Dimension(40,20);
       dTextField = new Dimension(150,20);
       dButton = new Dimension(95,20);
       dTextArea = new Dimension(280,130);

       this.setSize(dFrame);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLayout(null);
       this.setBackground(Color.lightGray);
       this.setLocation(450,150);

       lblValor = new Label("Valor: ");
       lblValor.setSize(dLabel);
       lblValor.setLocation(25,50);
       this.add(lblValor);

       lblFunc = new Label("Nome: ");
       lblFunc.setSize(dLabel);
       lblFunc.setLocation(25,80);
       this.add(lblFunc);

       lblCargo = new Label("Cargo: ");
       lblCargo.setSize(dLabel);
       lblCargo.setLocation(25,110);
       this.add(lblCargo);


        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        this.add(txtValor);

        txtFunc = new TextField(null);
        txtFunc.setSize(dTextField);
        txtFunc.setLocation(75,80);
        this.add(txtFunc);

        txtCargo = new TextField(null);
        txtCargo.setSize(dTextField);
        txtCargo.setLocation(75,110);
        this.add(txtCargo);

        btnConsulta = new Button("Consultar");
        btnConsulta.setSize(dButton);
        btnConsulta.setLocation(25,150);
        btnConsulta.addActionListener(this);
        this.add(btnConsulta);

        btnAumento = new Button("Dar Aumento");
        btnAumento.setSize(dButton);
        btnAumento.setLocation(25,185);
        btnAumento.addActionListener(this);
        this.add(btnAumento);

        btnPromocao = new Button("Promover");
        btnPromocao.setSize(dButton);
        btnPromocao.setLocation(180,150);
        btnPromocao.addActionListener(this);
        this.add(btnPromocao);

        btnDemetir = new Button("Demitir");
        btnDemetir.setSize(dButton);
        btnDemetir.setLocation(180,185);
        btnDemetir.addActionListener(this);
        this.add(btnDemetir);

        msgBox = new TextArea(null);
        msgBox.setSize(dTextArea);
        msgBox.setLocation(25,220);
        this.add(msgBox);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Funcionario func = new Funcionario();
        func.setNome("Maromo");
        func.setDocumento("1235325857");
        func.setEmail("maromo@etec.com");
        func.setCargo("Técnico em TI");
        func.setSalarioBase(1200.00);

        if(e.getSource()==btnAumento){
            func.setNome(txtFunc.getText());
            func.setSalarioBase(Double.parseDouble(txtValor.getText()));
            String mensagem = func.darAumento(func, func.getSalarioBase());
            msgBox.append(mensagem);
            txtValor.setText(null);
            txtFunc.setText(null);
            txtValor.requestFocus();
        }
        if(e.getSource()==btnPromocao){
            func.setNome(txtFunc.getText());
            String mensagem = func.promover(func, func.getCargo(), txtCargo.getText());
            func.setCargo(txtCargo.getText());
            msgBox.append(mensagem);
            txtValor.setText(null);
            txtFunc.setText(null);
            txtValor.requestFocus();
        }
        if(e.getSource()==btnConsulta){
            String mensagem = funcionario.consultar(func);
            msgBox.append(mensagem);
            txtValor.setText(null);
            txtFunc.setText(null);
            txtValor.requestFocus();
        }
        if(e.getSource()==btnDemetir){
            String mensagem = txtFunc.getText() + " foi demitido.";
            msgBox.append(mensagem);
            txtValor.setText(null);
            txtFunc.setText(null);
            txtValor.requestFocus();
        }
    }
}
