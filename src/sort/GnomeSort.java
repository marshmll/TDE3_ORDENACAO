package sort;

import util.Util;

public class GnomeSort extends AlgoritmoSort {
    @Override
    public void ordenar(int tam, int[] v) {
        int[] vetor = Util.copiarArray(v, tam);

        System.out.println("\t=== Gnome Sort ===");
        long tempoComeco = System.nanoTime();
        int trocas = 0;
        int iteracoes = 0;

        int i = 0;
        while (i < tam) {
            iteracoes++;

            if (i == 0) {
                i++;
            } else if (vetor[i] >= vetor[i - 1]) {
                i++;
            } else {
                int tmp = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = tmp;

                trocas++;
                i--;
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
