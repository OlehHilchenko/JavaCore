package main.java.com.OlehHilchenko.javacore.Chapter09.Interface;

//
public class AnotherClient implements Callback {
    //
    public void callback (int p) {
        System.out.println("Another one method callback()");
        System.out.println("p spuared equals " + (p * p));
    }
}
