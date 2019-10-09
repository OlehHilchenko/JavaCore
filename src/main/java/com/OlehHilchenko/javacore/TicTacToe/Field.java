package main.java.com.OlehHilchenko.javacore.TicTacToe;

public class Field {

    private char filed[][];

    Field(char[][] f) {
        filed = f;
    }

    void setFiled(int x, int y, char c) {
        this.filed[x][y] = c;
    }

    char[][] getFiled() {
        return filed;
    }
}
