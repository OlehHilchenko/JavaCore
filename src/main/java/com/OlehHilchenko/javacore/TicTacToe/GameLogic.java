package main.java.com.OlehHilchenko.javacore.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    protected final char THE_X = 'x';
    protected final char THE_O = 'o';

    Field DataObject = new Field();


    int getRandom() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }

    private String getSting() {
        Scanner st = new Scanner(System.in);
        return st.next();
    }

    char getChar() {
        Scanner ch = new Scanner(System.in);
        String choiceOrMove = ch.next();
        return choiceOrMove.charAt(0);
    }

    void nextTurn() {
        this.DataObject.setPlayCount(DataObject.getPlayCount() + 1);
    }

    void playWithPlayerOrMachine() {
        System.out.println(DataObject.YOU_WANT_PLAY_P_OR_M);
        while (true) {
            char ch = getChar();
            String s = ("" + ch).toLowerCase();
            if (s.equals(DataObject.P)) {
                playWithPlayer();
                return;
            } else if (s.equals(DataObject.M)) {
                playWithMachine();
                return;
            }
        }
    }

    private void playWithMachine() {
        choiceXorO();
        while (!DataObject.isEndGame()) {
            displayGameField();
            isTheCellUnderTheDigit(choiceMoveEn());
            checkWinner();
            checkDraw();
            nextTurn();
            if (DataObject.isEndGame()) {
                return;
            } else {
                machineStrokeSelection(getRandom());
                checkWinner();
                checkDraw();
                nextTurn();
            }
        }
    }

    private void playWithPlayer() {
        choiceXorO();
        while (!DataObject.isEndGame()) {
            displayGameField();
            isTheCellUnderTheDigit(choiceMoveEn());
            checkWinner();
            checkDraw();
            nextTurn();
        }
    }

    int choiceMoveEn() {
        while (true) {
            String c = getSting();
            int i = Integer.parseInt(c);
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
                return i;
            } else {
                return 0;
            }
        }
    }

    private void choiceXorO() {
        System.out.println(DataObject.CHOICE_X_OR_O);
        boolean check = false;
        while (!check) {
            switch (getChar()) {
                case THE_X:
                    System.out.println(DataObject.FIRST_PLAYER_X);
                    DataObject.setPlayCount(1);
                    check = true;
                    break;
                case THE_O:
                    System.out.println(DataObject.FIRST_PLAYER_O);
                    DataObject.setPlayCount(2);
                    check = true;
                    break;
                default:
                    System.out.println(DataObject.YOU_MUST_CHOICE_X_OR_O);
            }
        }
    }

    private void checkDraw() {
        int checkGameField = 0;
        char[][] gameField = DataObject.getFiled();
        boolean check = DataObject.isEndGame();
        if (check) {
            System.out.println(DataObject.SMILE);
            displayGameField();
        } else {
            for (int row = 0; row < gameField.length; row++) {
                for (int colum = 0; colum < gameField[row].length; colum++) {
                    if (THE_X == gameField[row][colum] || THE_O == gameField[row][colum]) {
                        checkGameField++;
                    }
                    if (9 == checkGameField) {
                        displayGameField();
                        System.out.println(DataObject.DRAW + gameOver());
                        DataObject.setEndGame(true);
                    }
                }
            }
        }
    }

    private String gameOver() {
        return DataObject.GAME_OVER;
    }

    void isTheCellUnderTheDigit(int i) {
        int cell = i - 1;
        int count = 0;
        for (int row = 0; row < DataObject.getFiled().length; row++) {
            for (int colum = 0; colum < DataObject.getFiled()[row].length; colum++) {
                if (cell == count && DataObject.getFiled()[row][colum] != THE_X && DataObject.getFiled()[row][colum] != THE_O) {
                    DataObject.setFiled(row, colum, whoPlay());
                    return;
                }
                count++;
            }
        }
        System.out.println(DataObject.SELECT_EMPTY_FIELD);
        isTheCellUnderTheDigit(choiceMoveEn());
    }

    void machineStrokeSelection(int i) {
        boolean f = false;
        int cell = i - 1;
        while (!f) {
            int count = 0;
            for (int row = 0; row < DataObject.getFiled().length; row++) {
                for (int colum = 0; colum < DataObject.getFiled()[row].length; colum++) {
                    if (cell == count && DataObject.getFiled()[row][colum] != THE_X && DataObject.getFiled()[row][colum] != THE_O) {
                        DataObject.setFiled(row, colum, whoPlay());
                        f = true;
                        return;
                    }
                    count++;
                }
            }
            cell = getRandom() - 1;
        }
    }

    private char whoPlay() {
        if (1 == DataObject.getPlayCount() % 2) {
            return THE_X;
        } else {
            return THE_O;
        }
    }

    void checkWinner() {
        //Check winner row and colum
        for (int row = 0; row < DataObject.getFiled().length; row++) {
            int countCheckRow = 0;
            int countCheckColum = 0;
            for (int colum = 0; colum < DataObject.getFiled()[row].length; colum++) {
                if (DataObject.getFiled()[row][colum] == whoPlay()) {
                    countCheckColum++;
                }
                if (DataObject.getFiled()[colum][row] == whoPlay()) {
                    countCheckRow++;
                }
                if (3 == countCheckColum) {
                    DataObject.setEndGame(true);
                    System.out.println(whoPlay() + DataObject.PLAYER_WINS);
                    return;
                }
                if (3 == countCheckRow) {
                    DataObject.setEndGame(true);
                    System.out.println(whoPlay() + DataObject.PLAYER_WINS);
                    return;
                }
            }
        }
        //Check winner diagonals
        if ((DataObject.getFiled()[0][0] == whoPlay() && DataObject.getFiled()[1][1] == whoPlay() && DataObject.getFiled()[2][2] == whoPlay())
                || (DataObject.getFiled()[2][0] == whoPlay() && DataObject.getFiled()[1][1] == whoPlay() && DataObject.getFiled()[0][2] == whoPlay())) {
            DataObject.setEndGame(true);
            System.out.println(whoPlay() + DataObject.PLAYER_WINS);
        }
    }

    void displayGameField() {
        System.out.println();
        for (int row = 0; row < DataObject.getFiled().length; row++) {
            System.out.println(" -------------");
            for (int colum = 0; colum < DataObject.getFiled()[row].length; colum++) {
                System.out.print(" | " + DataObject.getFiled()[row][colum]);
            }
            System.out.println(" |");
        }
        System.out.println(" -------------");
    }

}
