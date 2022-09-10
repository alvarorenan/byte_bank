import model.Conta;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoPaulo =  new Conta();
        contaDoPaulo.setSaldo(100);
        System.out.println(contaDoPaulo.deposita(50));
        System.out.println(contaDoPaulo.getSaldo());
        boolean conseguiuRetirar = contaDoPaulo.saca(200);
        System.out.println(contaDoPaulo.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        contaDaMarcela.transfere(400, contaDoPaulo);
        System.out.println(contaDaMarcela.getSaldo());


    }
}
