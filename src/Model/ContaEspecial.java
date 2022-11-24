package Model;

import Model.Conta;

public class ContaEspecial extends Conta{

    double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(int numero, String nome, String cpf, Double limite) {
        super(numero, nome, cpf);
        this.limite = limite;
    }
    @Override
    public double saldo() {
        return this.valorNaConta + limite;
    }
}
