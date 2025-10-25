package util;

public final class Util {
    private Util() {
    }

    public static String arrayParaString(int tam, int[] arr) {
        String s = "[";

        for (int i = 0; i < tam; i++) {
            s += arr[i];

            if (i < tam - 1) {
                s += ", ";
            }
        }

        s += "]";
        return s;
    }

    public static int[] copiarArray(int[] arr, int tam) {
        int[] copia = new int[tam];

        for (int i = 0; i < tam; i++) copia[i] = arr[i];

        return copia;
    }
}
