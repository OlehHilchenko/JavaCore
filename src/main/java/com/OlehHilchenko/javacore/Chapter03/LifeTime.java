package main.java.com.OlehHilchenko.javacore.Chapter03;

//demonstrate variables life time

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; //variable y initialise
                        //every time you enter a code block
            System.out.println("y equals: " + y); //here always
                                                    //value is displayed -1
            y = 100;
            System.out.println("Now y equals: " + y);
        }
    }
}
