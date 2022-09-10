import model.Conta;

public class CriarConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 200;
        System.out.println(conta.saldo);
    }
}
