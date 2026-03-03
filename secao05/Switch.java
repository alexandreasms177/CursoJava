package secao05;

    import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //1- switch case, break e defalt

        System.out.println("dia da semana:");
        Scanner scanner = new Scanner(System.in);
        int DiaDaSemana = scanner.nextInt();
        scanner.close();

        switch (DiaDaSemana) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quita-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("digite um numero entre 1 e 7");
                break;
        }        
        //2- swit sem break  
        switch (1) {
            case 1:
                System.out.println("execução1");

            case 2:
                System.out.println("execução2");

            case 3:
                System.out.println("execução3");

            case 4:
                System.out.println("execução4");
                    
            
            default:
                System.out.println("execução5");
        }
    }
}
