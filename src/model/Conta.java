package model;

import java.util.UUID;

public class Conta {
    private double saldo;
    private Cliente titular;

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

    public boolean transfere(double valor, Conta destino){
        if(this.saldo>=valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }  return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
