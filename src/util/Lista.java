package util;

public class Lista {
    private Node cabeca;
    private int tamanho;

    public Lista() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void inserir(int k) {
        if (this.tamanho == 0) {
            this.cabeca = new Node(k);
        } else {
            Node n = new Node(k);
            n.setProx(this.cabeca);
            this.cabeca = n;
        }

        tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public Node getCabeca() {
        return this.cabeca;
    }
}
