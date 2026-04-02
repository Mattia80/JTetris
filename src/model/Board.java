package model;

public class Board {
    private int altezza;
    private int larghezza;
    private int[][] griglia;

    public Board(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.griglia = new int[altezza][larghezza];
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int[][] getGriglia() {
        return griglia;
    }

    public boolean isInside(int x, int y) {
        return true;
    }

    public boolean isCellFree(int x, int y) {
        return true;
    }
    public boolean isValidPosition(int x, int y) {
        return true;
    }
    public void posizionaPezzo(Pezzo pezzo) {

    }
    public void rimuoviRighe() {

    }
}
