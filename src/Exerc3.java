import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] faturamento = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0,
                26742.6612, 0.0, 42889.2258,
                46251.174, 11191.4722, 0.0,
                0.0, 0.0, 3847.4823, 373.7838,
                2659.7563, 48924.2448, 18419.2614,
                0.0, 0.0, 35240.1826, 43829.1667,
                18235.6852, 4355.0662, 13327.1025,
                0.0, 0.0, 25681.8318, 1718.1221,
                13220.495, 8414.61};

        double maiorValor = faturamento[0];
        double menorValor = faturamento[0];
        double media = 0;

        for (int i=0; i<faturamento.length-1; i++) {
            media += faturamento[i];
            if (faturamento[i] != 0 && faturamento[i] < menorValor) {
                menorValor = faturamento[i];
            }
            if (faturamento[i] > maiorValor) {
                maiorValor = faturamento[i];
            }
        }

        double mediaMensal = media / faturamento.length;
        int diasFaturamentoSuperior = 0;

        for (int i=0; i<faturamento.length-1; i++) {
            if (mediaMensal > faturamento[i] && faturamento[i] != 0) {
                diasFaturamentoSuperior++;
            }
        }

        System.out.println(menorValor);
        System.out.println(maiorValor);
        System.out.println(diasFaturamentoSuperior);

        sc.close();
    }
}