package main.java.com.OlehHilchenko.javacore.Chapter07;

//
public class CommandLine {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
