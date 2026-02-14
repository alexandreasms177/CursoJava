package secao02;

public class variavel {

    public static void main(String[] args) {
        
        String nome = "Alexandre";

        int idade = 19;

        float altura = 1.80f;

        boolean estudando = true;

        System.out.println("nome:"+ nome);

        System.out.println("idade:"+ idade);
        
        System.out.println("altura:"+ String.format("%.2f", altura));
        
        System.out.println("estudando:"+ estudando);
    }

}