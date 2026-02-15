package secao02;

public class exercicio {
    public static void main(String[] args) {
        //ex1
        int valor = 10;
        int dobroValor = valor*2;
        System.out.println(dobroValor);

        //ex2
        char letra = 'B';
        int codigo = (int) letra;
        System.out.println(codigo);

        //ex3
        double valor1 = 15.75;
        double valor2 = 20.40;
        double soma = valor1 + valor2;
        System.out.println(soma);

        //ex4
        long numerL = 2_000_000_000L;
        int valorInt = (int) numerL;
        System.out.println(valorInt);

        //ex5
        String olaString = "olá mundo!";
        String msg = olaString + "bem vindo ao java!";
        System.out.println(msg);
    }
}
