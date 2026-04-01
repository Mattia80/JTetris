package model;

import java.util.ArrayList;
import java.util.List;

public class Pezzo {
    private int xPosition;
    private int yPosition;
    private TetrominoType tipo;
    private int[][][] rotazioni;
    private int orientamento;

    public Pezzo(int xPosition, int yPosition, TetrominoType tipo) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.tipo = tipo;
        this.orientamento = 0;
        this.rotazioni = tipo.getRotazioni();
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public TetrominoType getTipo() {
        return tipo;
    }

    public int getOrientamento() {
        return orientamento;
    }

    public void moveLeft() {
        xPosition--;
    }

    public void moveRight() {
        xPosition++;
    }

    public void moveDown() {
        yPosition++;
    }

    public void rotate() {
        orientamento = (orientamento + 1) % tipo.getRotazioni().length;
    }

    public int[][] getFormaCorrente() {
        return rotazioni[orientamento];
    }

    public List<Posizione> getCelleOccupate() {
        List<Posizione> celleOccupate = new ArrayList<>();
        int[][] forma = getFormaCorrente();
        for (int i = 0; i < forma.length; i++) {
            for (int j = 0; j < forma[i].length; j++) {
                if (forma[i][j] == 1) {
                    celleOccupate.add(new Posizione(xPosition + j, yPosition + i));
                }
            }
        }
        return celleOccupate;
    }

}
