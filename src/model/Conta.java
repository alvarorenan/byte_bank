package model;

import java.util.UUID;

public class Conta {
    public double saldo;
    public int agencia;
    int numero;
    String titular;

    public String deposita(double valor) {
        this.saldo += valor;
        return "Depósito realizado com sucesso. Seu ticket é: " + UUID.randomUUID().toString();
    }
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

}
