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

        //2- next int
        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Seu numero é: "+ n1);
        
    }
}
