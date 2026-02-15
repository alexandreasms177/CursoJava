package secao04;

    import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        //leitura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Nota 01: ");
        int nota01 = scanner.nextInt();

        System.out.println("Nota 02: ");
        int nota02 = scanner.nextInt();

        System.out.println("Nota 03: ");
        int nota03 = scanner.nextInt();

        scanner.close();

        double soma = nota01+nota02+nota03;
        double media = soma/3;

        //execucao

        System.out.println("Nome: "+ nome);
        System.out.println("Media: "+ String.format("%.2f",media));

        
        if (media>=7) {
            System.out.println("Status: Aluno aprovado");
        } else {
            System.out.println("Status: Aluno reprovado");
        }
    }
    
}