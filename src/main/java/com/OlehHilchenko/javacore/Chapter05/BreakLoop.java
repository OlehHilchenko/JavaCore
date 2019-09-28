package main.java.com.OlehHilchenko.javacore.Chapter05;

//apply break for exit out loop
public class BreakLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            if(i == 10) break;//exit out loop, if value variable i equal 10

            System.out.println("i: " + i);
        }
        System.out.println("Cycle completed.");
    }
}
