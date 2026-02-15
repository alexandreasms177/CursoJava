package secao02;

import java.util.Scanner;

public class scaner {


    public static void main(String[] args) {

        //1- testando scaner
        Scanner scanner = new Scanner(System.in);
        //mensagem para o usuario entender o que precisa digitar
        System.out.println("Digite o seu nome: ");
        //resgate do valor no terminal
        String nome = scanner.nextLine();
        //exibe o valor
        System.out.println("ola "+ nome);

        //nextInt
        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Seu numero é: "+ n1);
        
        //2- priblema no next line

        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("digite um texto:");
        String txt = scanner.nextLine();

        System.out.println("os dados sao: n = "+n+" e txt = "+txt);

        //fechamento do scanner para evitar memory leak
        scanner.close();
    }
}
