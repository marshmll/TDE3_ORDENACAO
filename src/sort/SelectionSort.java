package sort;

import util.Util;

public class SelectionSort extends AlgoritmoSort {
    @Override
    public void ordenar(int tam, int[] v) {
        int[] vetor = Util.copiarArray(v, tam);

        int trocas = 0;
        int iteracoes = 0;

        System.out.println("\t=== Selection Sort ===");

        long comeco = System.nanoTime();

        for (int i = 0; i < tam - 1; i++) {
            int indiceMenor = i;


            for (int j = i; j < tam; j++) {
                iteracoes++;
                if (vetor[j] < vetor[indiceMenor]) indiceMenor = j;
            }

            if (indiceMenor != i) {
                trocas++;
                vetor[i] = vetor[i] ^ vetor[indiceMenor];
                vetor[indiceMenor] = vetor[i] ^ vetor[indiceMenor];
                vetor[i] = vetor[i] ^ vetor[indiceMenor];
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
