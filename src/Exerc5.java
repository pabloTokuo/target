import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "Pablo";
        String nomeInvertido = "";

        for (int i=nome.length()-1; i>=0; i--) {
            nomeInvertido += nome.charAt(i);
        }

        System.out.println(nome);
        System.out.println(nomeInvertido);
    }
}
