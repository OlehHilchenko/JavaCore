package main.java.com.OlehHilchenko.javacore.Chapter09.Interface;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
