package com.company;

public class Funcionario {
    private int Idfunc;
    private String nome;
    private String email;
    private String documento;
    private Double salarioBase;
    private String cargo;

    public int getIdfunc() {
        return Idfunc;
    }

    public void setIdfunc(int idfunc) {
        Idfunc = idfunc;
    }

    public String getNome() {
        return nome + "\n";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String darAumento(Funcionario func, Double valor) {
        func.salarioBase += valor;
        return func.nome + " recebeu um aumento de R$" + valor;
    }

    public String promover(Funcionario func, String cargo, String novoCargo) {
        return func.nome + " foi promovido de " + cargo + " para " + novoCargo + ".";
    }

    public String consultar(Funcionario func) {

        return "Nome do Funcionário: " + func.nome + "\n" + "Email: " + func.email + "\n" + "Documento: " + func.documento + "\n" + "Salário: " + func.salarioBase + "\n" + "Cargo: " + func.cargo + "\n";
    }

}
