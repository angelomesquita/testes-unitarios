package net.atos.banco;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente ou valor inválido!");
        }
    }
}
