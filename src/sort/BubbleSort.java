package sort;

import util.Util;

public class BubbleSort extends AlgoritmoSort {
    @Override
    public void ordenar(int tam, int[] v) {
        int[] vetor = Util.copiarArray(v, tam);

        int tmp;
        int trocas = 0;
        int iteracoes = 0;
        System.out.println("\t=== Bubble Sort ===");

        long comeco = System.nanoTime();

        boolean trocou = true;
        for (int i = 0; i < tam && trocou; i++) {
            trocou = false;

            for (int j = 1; j < tam - i; j++) {
                iteracoes++;
                if (vetor[j - 1] > vetor[j]) {
                    trocou = true;
                    tmp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = tmp;
                    trocas++;
                }
            }
        }

        long fim = System.nanoTime();
        long duracaoNano = fim - comeco;

        System.out.println("\tTrocas: " + trocas);
        System.out.println("\tIterações: " + iteracoes);
        System.out.println("\tTempo: " + duracaoNano + "ns");
        System.out.println("\tArray: " + Util.arrayParaString(tam, vetor));
    }
}
