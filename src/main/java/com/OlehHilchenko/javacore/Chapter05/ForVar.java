package main.java.com.OlehHilchenko.javacore.Chapter05;

//individual parts of the loop statement for may be absent

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i equal " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
