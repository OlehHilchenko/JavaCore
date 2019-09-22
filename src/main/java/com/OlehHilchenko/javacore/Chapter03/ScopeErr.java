package main.java.com.OlehHilchenko.javacore.Chapter03;

//this program cannot be compiled

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {               //new scope action
            //int bar = 2;//compiled time error
        }               //variable bar already defined
    }
}
