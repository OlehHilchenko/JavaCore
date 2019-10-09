package main.java.com.OlehHilchenko.javacore.Chapter09.Interface;

public class Client implements Callback {
    //
    public void callback(int p) {
        System.out.println(
                "Method callback(), called with value " + p
        );
    }

    void nonIfaceMeth () {
        System.out.println("In class implemented interfaces can identify other members. ");
    }
}
