package sort;

import util.Util;

public class CombSort extends AlgoritmoSort {
    @Override
    public void ordenar(int tam, int[] v) {
        int[] vetor = Util.copiarArray(v, tam);

        System.out.println("\t=== Comb Sort ===");
        long tempoComeco = System.nanoTime();
        int trocas = 0;
        int iteracoes = 0;

        int gap = tam;
        boolean trocou = true;

        while (gap != 1 || trocou) {
            gap = (gap * 10) / 13;

            if (gap < 1) gap = 1;

            trocou = false;

            for (int i = 0; i < tam - gap; i++) {
                iteracoes++;
                if (vetor[i] > vetor[i + gap]) {
                    int tmp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = tmp;

                    trocou = true;
                    trocas++;
                }
            }
        }

        long tempoFim = System.nanoTime();
        long duracaoNano = tempoFim - tempoComeco;

        System.out.println("\tTrocas: " + trocas);
        System.out.println("\tIterações: " + iteracoes);
        System.out.println("\tTempo: " + duracaoNano + "ns");
        System.out.println("\tArray: " + Util.arrayParaString(tam, vetor));
    }
}
