package util;

public class Node {
    private Node prox;
    private int chave;

    public Node(int chave) {
        this.chave = chave;
        this.prox = null;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public Node getProx() {
        return prox;
    }

    public void setProx(Node prox) {
        this.prox = prox;
    }
}
