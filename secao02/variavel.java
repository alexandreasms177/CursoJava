package secao02;


public class variavel {

    public static void main(String[] args) {

        //1- tipos de variaveis
        
        String nome = "Alexandre";

        int idade = 19;

        double altura = 1.80f;

        boolean estudando = true;

        System.out.println("nome:"+ nome);

        System.out.println("idade:"+ idade);
        
        System.out.println("altura:"+ String.format("%.2f", altura));
        
        System.out.println("estudando:"+ estudando);

        //2- atribuição de variaveis

        float nota1 = 10.0f;

        float nota2 = 7.5f;
        
        float media = nota1 + nota2;

        System.out.println("nota1:"+nota1);

        System.out.println("nota2:"+nota2);

        System.out.println("media:"+media);

        //3- comentarios

        //comentario de linha

        /*
        comentarios de bloco
        comentarios de bloco
        comentarios de bloco
        */


        /**
         * comentario de documentação
         * 
         * ex:
         * 
         * param1:primeiro valor
         * param2:segundo valor
         * 
         * retorno:soma
         * 
         */

        //4-string

        String primeiroNome = "Alexandre";
        String segundoNome = "Almeida";
        String nomeCompleto = primeiroNome + " " + segundoNome;

        System.out.println("nome completo:" + nomeCompleto);

        //5- char

        char letra = 'A';

        System.out.println(letra);

        char simbolo = '$';

        System.out.println(simbolo);

        //6- int

        int n = 97;

        System.out.println(n);

        System.out.println(n+4);

        System.out.println(n*4);

        System.out.println(n/4);

        //7- long

        long populacao = 8_000_000_000L;

        System.out.println(populacao);

        System.out.println(populacao + 1);

        //8- double

        double preco = 19.99f;

        System.out.println(preco);

        System.out.println(preco - 3);

        System.out.println(preco / 3);

        System.out.println(String.format("%.2f",preco/3));

        //9- bolean

        boolean trabalhando = true;

        System.out.println("trabalhando:"+trabalhando);

        //10- operadores aritmeticos

        System.out.println(22 + 13);

        System.out.println(22 - 13);

        System.out.println(22 / 13);

        System.out.println(22 * 13);

        System.out.println(22 % 13);

        int x = 13;

        x++;
        
        System.out.println(x);

        x--;

        System.out.println(x);

        x+=5;

        System.out.println(x);

        x-=5;

        System.out.println(x);

        //11- type casting

        //implicito(widening)
        int numero =42;

        long numeroLong = numero;

        double numeroDouble = numero;

        System.out.println(numeroLong);

        System.out.println(numeroDouble);

        //explicito(narrowing)
        double valorDouble = 9.80;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        //casting de char para int

        char letra2 = 'A';

        int codigoAscii = (int) letra2;

        System.out.println(codigoAscii);

        //12- constantes

        final int DIAS_DA_SEMANA = 7;

        System.out.println("dias da semana:" + DIAS_DA_SEMANA);

        //13- var

        var z =10;

        System.out.println(z);

        z = 5;

        System.out.println(z);
    }

}