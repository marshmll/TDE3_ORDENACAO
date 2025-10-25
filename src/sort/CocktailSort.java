package sort;

import util.Util;

public class CocktailSort extends AlgoritmoSort {
    @Override
    public void ordenar(int tam, int[] v) {
        int[] vetor = Util.copiarArray(v, tam);

        boolean trocou = true;
        int comeco = 0;
        int fim = tam - 1;

        System.out.println("\t=== Cocktail Sort ===");
        long tempoComeco = System.nanoTime();
        int trocas = 0;
        int iteracoes = 0;

        while (trocou) {
            trocou = false;

            // Passada para frente (BubbleSort)
            for (int i = comeco; i < fim; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int tmp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = tmp;

                    trocou = true;
                    trocas++;
                }

                iteracoes++;
            }

            if (trocou) {
                trocou = false;
                fim--; // O último elemento já está no lugar correto, subtrai 1 do fim

                // Passada para trás
                for (int i = fim - 1; i >= comeco; i--) {
                    if (vetor[i] > vetor[i + 1]) {
                        int tmp = vetor[i];
                        vetor[i] = vetor[i + 1];
                        vetor[i + 1] = tmp;

                        trocou = true;
                        trocas++;
                    }

                    iteracoes++;
                }

                comeco++; // O primeiro elemento está no local correto, aumenta 1 no comeco
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
