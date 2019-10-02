package main.java.com.OlehHilchenko.javacore.Chapter05;

//operator application continue with mark
public class ContinueLabel {
    public static void main(String[] args) {
        ouyer: for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (j > i){
                    System.out.println();
                    continue ouyer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
