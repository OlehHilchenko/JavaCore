package main.java.com.OlehHilchenko.javacore.TicTacToe;

public class Field {
    protected static final char[][] P_F = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    protected static final String GAME_OVER = "GAME OVER MAN !!!";
    protected static final String YOU_WANT_PLAY_P_OR_M = "You want play with player or machine ? p/m";
    protected static final String CHOICE_X_OR_O = "Choice x or o !";
    protected static final String FIRST_PLAYER_X = "firs player is x, second player is o !";
    protected static final String FIRST_PLAYER_O = "firs player is o, second player is x !";
    protected static final String YOU_MUST_CHOICE_X_OR_O = "you must choice x or o !!!";
    protected static final String P = "p";
    protected static final String M = "m";
    protected static final String SMILE = ":-)";
    protected static final String DRAW = "Draw!!!";

    protected static final String SELECT_EMPTY_FIELD = "select empty field";
    protected static final String PLAYER_WINS = " player wins!";


    private final char filedX[][] = {{'x', 'x', 'x'}, {'x', 'x', 'x'}, {'x', 'x', 'x'}};
    private final char filedO[][] = {{'o', 'o', 'o'}, {'o', 'o', 'o'}, {'o', 'o', 'o'}};
    private char filed[][] = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    private boolean endGame = false;
    private int playCount = 0;


    public void setFiled(char[][] filed) {
        this.filed = filed;
    }

    public void setFiled(int x, int y, char c) {
        this.filed[x][y] = c;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }

    public static char[][] getpF() {
        return P_F;
    }

    public static String getGameOver() {
        return GAME_OVER;
    }

    public static String getYouWantPlayPOrM() {
        return YOU_WANT_PLAY_P_OR_M;
    }

    public static String getChoiceXOrO() {
        return CHOICE_X_OR_O;
    }

    public static String getFirstPlayerX() {
        return FIRST_PLAYER_X;
    }

    public static String getFirstPlayerO() {
        return FIRST_PLAYER_O;
    }

    public static String getYouMustChoiceXOrO() {
        return YOU_MUST_CHOICE_X_OR_O;
    }

    public static String getP() {
        return P;
    }

    public static String getM() {
        return M;
    }

    public static String getSMILE() {
        return SMILE;
    }

    public static String getDRAW() {
        return DRAW;
    }

    public char[][] getFiledX() {
        return filedX;
    }

    public char[][] getFiledO() {
        return filedO;
    }

    public char[][] getFiled() {
        return filed;
    }

    public int getPlayCount() {
        return playCount;
    }

    public boolean isEndGame() {
        return endGame;
    }

}
