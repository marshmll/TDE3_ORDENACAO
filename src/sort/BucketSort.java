package sort;

import util.Lista;
import util.Node;
import util.Util;

public class BucketSort extends AlgoritmoSort {
    private int trocas = 0;
    private int iteracoes = 0;

    @Override
    public void ordenar(int tam, int[] v) {
        int[] vetor = Util.copiarArray(v, tam);

        System.out.println("\t=== Bucket Sort ===");

        long tempoComeco = System.nanoTime();

        // Encontrar valor máximo
        int valorMax = vetor[0];
        for (int i = 1; i < tam; i++) {
            iteracoes++;
            if (vetor[i] > valorMax) valorMax = vetor[i];
        }

        int qtdeBuckets = 10;
        int rangeBucket = (valorMax / qtdeBuckets) + 1;

        Lista[] buckets = new Lista[qtdeBuckets];

        // Inicializar buckets
        for (int i = 0; i < qtdeBuckets; i++) {
            iteracoes++;
            buckets[i] = new Lista();
        }

        // Distribuir elementos nos buckets
        for (int i = 0; i < tam; i++) {
            int indiceBucket = vetor[i] / rangeBucket;
            if (indiceBucket >= qtdeBuckets) indiceBucket = qtdeBuckets - 1;
            buckets[indiceBucket].inserir(vetor[i]);
            iteracoes++;
        }

        // Reconstruir array ordenado
        int k = 0;
        for (int i = 0; i < qtdeBuckets; i++) {
            iteracoes++;
            this.bubbleSortLista(buckets[i]);

            // Percorre a lista
            Node atual = buckets[i].getCabeca();
            while (atual != null) {
                vetor[k] = atual.getChave(); // Atribui à posição k
                k++; // Incrementa k
                atual = atual.getProx();
                iteracoes++;
            }
        }

        long tempoFim = System.nanoTime();
        long duracaoNano = tempoFim - tempoComeco;

        System.out.println("\tTrocas: " + trocas);
        System.out.println("\tIterações: " + iteracoes);
        System.out.println("\tTempo: " + duracaoNano + "ns");
        System.out.println("\tArray: " + Util.arrayParaString(tam, vetor));
    }

    private void bubbleSortLista(Lista lista) {
        if (lista.getTamanho() <= 1) return;

        boolean trocou;
        do {
            trocou = false;
            Node atual = lista.getCabeca();

            while (atual != null && atual.getProx() != null) {
                iteracoes++;

                if (atual.getChave() > atual.getProx().getChave()) {
                    // Troca os valores
                    int temp = atual.getChave();
                    atual.setChave(atual.getProx().getChave());
                    atual.getProx().setChave(temp);

                    trocou = true;
                    trocas++;
                }
                atual = atual.getProx();
            }
        } while (trocou);
    }
}