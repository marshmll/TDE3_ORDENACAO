import sort.*;
import util.Util;

public class Main {
    public static void main(String[] args) {
        final int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        final int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        final int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        final int[][] vetores = {vetor1, vetor2, vetor3};
        final int QTD_VETORES = 3;
        final int TAM_VETORES = 20;

        final AlgoritmoSort[] sorts = {
                new BubbleSort(),
                new SelectionSort(),
                new CocktailSort(),
                new CombSort(),
                new GnomeSort(),
                new BucketSort()
        };

        final int QTD_ALGORITMOS = 6;

        for (int i = 0; i < QTD_VETORES; i++) {
            int[] vetor = vetores[i];
            System.out.println("=== VETOR" + (i + 1) + " ===");
            System.out.println("Original: " + Util.arrayParaString(TAM_VETORES, vetor));

            for (int j = 0; j < QTD_ALGORITMOS; j++) {
                AlgoritmoSort algoritmo = sorts[j];
                algoritmo.ordenar(TAM_VETORES, vetor);
            }
        }
    }
}