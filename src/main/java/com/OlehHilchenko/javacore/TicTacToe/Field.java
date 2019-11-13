package main.java.com.OlehHilchenko.javacore.TicTacToe;

import java.util.Arrays;

public class Field {
    //only test
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Arrays.equals(filed, field.filed);
    }
    //only test
    @Override
    public int hashCode() {
        return Arrays.hashCode(filed);
    }

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
