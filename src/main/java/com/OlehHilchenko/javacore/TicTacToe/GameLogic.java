package main.java.com.OlehHilchenko.javacore.TicTacToe;

import java.util.Random;
import java.util.Scanner;

class GameLogic implements SharedConst {

    private boolean endGame = false;
    private int playCount = 0;
    private Field field = new Field(P_F);


    private int getRandom() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }

    private String getSting() {
        Scanner st = new Scanner(System.in);
        return st.next();
    }

    private char getChar() {
        Scanner ch = new Scanner(System.in);
        String choiceOrMove = ch.next();
        return choiceOrMove.charAt(0);
    }

    private void nextTurn() {
        this.playCount = playCount + 1;
    }

    void playWithPlayerOrMachine() {
        System.out.println(YOU_WANT_PLAY_P_OR_M);
        while (true) {
            char ch = getChar();
            String s = ("" + ch).toLowerCase();
            if (s.equals(P)) {
                playWithPlayer();
                return;
            } else if (s.equals(M)) {
                playWithMachine();
                return;
            }
        }
    }

    private void playWithMachine() {
        choiceXorO();
        while (!endGame) {
            displayGameField();
            playerSelection(getScanAndCheck());
            checkWinner();
            checkDraw2(field.getFiled());
            nextTurn();
            if (endGame) {
                return;
            } else {
                machinePlaySelection(getRandom());
                checkWinner();
                checkDraw2(field.getFiled());
                nextTurn();
            }
        }
    }

    private void playWithPlayer() {
        choiceXorO();
        while (!endGame) {
            displayGameField();
            playerSelection(getScanAndCheck());
            checkWinner();
            checkDraw2(field.getFiled());
            nextTurn();
        }
    }

    private int getScanAndCheck() {
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
        System.out.println(CHOICE_X_OR_O);
        boolean check = false;
        while (!check) {
            switch (getChar()) {
                case THE_X:
                    System.out.println(FIRST_PLAYER_X);
                    playCount = 1;
                    check = true;
                    break;
                case THE_O:
                    System.out.println(FIRST_PLAYER_O);
                    playCount = 2;
                    check = true;
                    break;
                default:
                    System.out.println(YOU_MUST_CHOICE_X_OR_O);
            }
        }
    }

    private void checkDraw() {
        int checkGameField = 0;
        char[][] gameField = field.getFiled();
        if (endGame) {
            System.out.println(SMILE);
            displayGameField();
        } else {
            for (int row = 0; row < gameField.length; row++) {
                for (int colum = 0; colum < gameField[row].length; colum++) {
                    if (THE_X == gameField[row][colum] || THE_O == gameField[row][colum]) {
                        checkGameField++;
                    }
                    if (9 == checkGameField) {
                        displayGameField();
                        System.out.println(DRAW + gameOver());
                        endGame = true;
                    }
                }
            }
        }
    }

    private void checkDraw2(char[][] gf) {
        if (endGame) {
            System.out.println(SMILE);
            displayGameField();
        } else {
            int checkCount = 0;
            for (char c[] : gf)
                for (char x : c) {
                    if (x == THE_O || x == THE_X)
                        checkCount++;
                    if (checkCount == 9) {
                        displayGameField();
                        System.out.println(DRAW + gameOver());
                        endGame = true;
                        return;
                    }
                }
        }
    }

    private String gameOver() {
        return GAME_OVER;
    }

    //Player field play selection
    private void playerSelection(int i) {
        int cell = i - 1;
        int count = 0;
        for (int row = 0; row < field.getFiled().length; row++) {
            for (int colum = 0; colum < field.getFiled()[row].length; colum++) {
                if (cell == count && field.getFiled()[row][colum] != THE_X && field.getFiled()[row][colum] != THE_O) {
                    field.setFiled(row, colum, whoPlay());
                    return;
                }
                count++;
            }
        }
        System.out.println(SELECT_EMPTY_FIELD);
        playerSelection(getScanAndCheck());
    }

    //Machine field play selection
    private void machinePlaySelection(int i) {
        int cell = i - 1;
        while (true) {
            int count = 0;
            for (int row = 0; row < field.getFiled().length; row++) {
                for (int colum = 0; colum < field.getFiled()[row].length; colum++) {
                    if (cell == count && field.getFiled()[row][colum] != THE_X && field.getFiled()[row][colum] != THE_O) {
                        field.setFiled(row, colum, whoPlay());
                        return;
                    }
                    count++;
                }
            }
            cell = getRandom() - 1;
        }
    }

    private char whoPlay() {
        if (1 == playCount % 2) {
            return THE_X;
        } else {
            return THE_O;
        }
    }

    private void checkWinner() {
        //Check winner row and colum
        for (int row = 0; row < field.getFiled().length; row++) {
            int countCheckRow = 0;
            int countCheckColum = 0;
            for (int colum = 0; colum < field.getFiled()[row].length; colum++) {
                if (field.getFiled()[row][colum] == whoPlay()) {
                    countCheckColum++;
                }
                if (field.getFiled()[colum][row] == whoPlay()) {
                    countCheckRow++;
                }
                if (3 == countCheckColum || 3 == countCheckRow) {
                    endGame = true;
                    System.out.println(whoPlay() + PLAYER_WINS);
                    return;
                }
            }
        }
        //Check winner diagonals
        if ((field.getFiled()[0][0] == whoPlay() && field.getFiled()[1][1] == whoPlay() && field.getFiled()[2][2] == whoPlay())
                || (field.getFiled()[2][0] == whoPlay() && field.getFiled()[1][1] == whoPlay() && field.getFiled()[0][2] == whoPlay())) {
            endGame = true;
            System.out.println(whoPlay() + PLAYER_WINS);
        }
    }

    private void displayGameField() {
        System.out.println(endGame ? " " : whoPlay() + " player walks");
        System.out.println();
        for (int row = 0; row < field.getFiled().length; row++) {
            System.out.println(" -------------");
            for (int colum = 0; colum < field.getFiled()[row].length; colum++) {
                System.out.print(" | " + field.getFiled()[row][colum]);
            }
            System.out.println(" |");
        }
        System.out.println(" -------------");
    }

}
