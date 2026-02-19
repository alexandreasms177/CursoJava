package secao05;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //1- and
        int idade = 18;
        boolean temCarteira = true;

        System.out.println("pode dirigir?");
        System.out.println(idade >= 18 && temCarteira);
        
        //2- or
        boolean estarChovendo = false;
        boolean temGuardachuva = true;

        System.out.println(estarChovendo || temGuardachuva);
        System.out.println(false || false);

        int idade2 = 16;
        boolean ehMembro = true;

        if (idade2 >16 || ehMembro) {
            System.out.println("entrada");
        }else{
            System.out.println("entrada negada");
        }
    }
}
