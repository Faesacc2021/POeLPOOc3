package Model;

import Model.Conta;


public class Conta {

    int numero;
    String nome;
    String cpf;
    double valorNaConta;

    public Conta(int numero, String nome, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorNaConta() {
        return valorNaConta;
    }
    private void setValorNaConta(double valorNaConta) {
        this.valorNaConta = valorNaConta;
    }


    public double saldo() {
        return getValorNaConta();
    }

    
    public int comparaContas(Conta contaPivo) {
        if (this.getNome().compareTo(contaPivo.getNome()) > 0) {
            return 1;
        }
        if (this.getNome().compareTo(contaPivo.getNome()) < 0) {
            return -1;
        }
        if (this.getCpf().compareTo(contaPivo.getCpf()) > 0) {
            return 1;
        }
        if (this.getCpf().compareTo(contaPivo.getCpf()) < 0) {
            return -1;
        }
        if (this.getNumero() > contaPivo.getNumero()) {
            return 1;
        }
        if (this.getNumero() < contaPivo.getNumero()) {
            return -1;
        }
        return 0;
    }
}
