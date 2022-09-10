import model.Conta;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.setSaldo(300);
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
        Conta segundaConta = primeiraConta;
        segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
        segundaConta.deposita(100);
        System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
        System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
        if (primeiraConta == segundaConta) {
            System.out.println("São a mesma conta");
        }
    }
}
