package secao05;

    import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {

        //1-boolean
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        //2- operadores de comparacao
        int x = 10;
        System.out.println(x == 10);
        System.out.println(x == 5);
        System.out.println(x != 10);
        System.out.println(x != 5);

        int y = 5;
        System.out.println(y > 5);
        System.out.println(y >= 5);
        System.out.println(y < 5);
        System.out.println(y <= 5);

        //3- atribuição e comparação
        int n = 5;
        System.out.println(n == 5);

        //4- comparação de srings
        String str1 = "java";
        String str2 = new String("java");
        String str3 = "JAVA";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
        System.out.println(str1 == "java");
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str2.equals("java"));
        System.out.println(str1.equalsIgnoreCase(str3));

        //5- if
        int numero = 10;
        if (numero>5) {
            System.out.println("o numero eh maior que 5");
        }
        String texto ="teste";
        if (texto.equals("teste")) {
            System.out.println("o texto eh igual");
        }

        //6- else
        int q = 7;
        if (q>10) {
            System.out.println("q eh maior que 10");
        }else{
            System.out.println("q eh menor que 10");
        }
        
        //7- elseif
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua nota:");
        int nota = scanner.nextInt();
        scanner.close();
        if (nota==10) {
            System.out.println("gabaritou");
        }else if (nota>=6 && nota <=9) {
            System.out.println("passou");
        }else if (nota<6 && nota>=00) {
            System.out.println("reprovou");
        }else{
            System.out.println("valor invalido");
        }
    }
}
