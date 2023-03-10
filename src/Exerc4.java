import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        /*
        SP – R$67.836,43
        RJ – R$36.678,66
        MG – R$29.229,88
        ES – R$27.165,48
        Outros – R$19.849,53
         */

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27365.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        double percetualSP = (sp / total) * 100;
        double percetualRJ = (rj / total) * 100;
        double percetualMG = (mg / total) * 100;
        double percetualES = (es / total) * 100;
        double percetualOUTROS = (outros / total) * 100;

        System.out.println("Percetual SP: " + df.format(percetualSP) + "%");
        System.out.println("Percetual RJ: " + df.format(percetualRJ) + "%");
        System.out.println("Percetual MG: " + df.format(percetualMG) + "%");
        System.out.println("Percetual ES: " + df.format(percetualES) + "%");
        System.out.println("Percetual Outros: " + df.format(percetualOUTROS) + "%");

        sc.close();
    }
}
