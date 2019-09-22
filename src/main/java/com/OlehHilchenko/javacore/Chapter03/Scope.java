package main.java.com.OlehHilchenko.javacore.Chapter03;

//demonstrate code block action


public class Scope {
    public static void main(String[] args) {
        int x; //this variable is available to all code from a method main()

        x = 10;
        if (x == 10){//start of a new scope
            int y = 20; //accessible only to this block of code

            //both variables x and y are available in this scope
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; //error! variable y is not available
                    //in this scope, while the
                    //variable x is available here too
        System.out.println("x equals " + x);
    }
}
