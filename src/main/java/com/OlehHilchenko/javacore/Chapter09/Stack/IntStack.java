package main.java.com.OlehHilchenko.javacore.Chapter09.Stack;

public interface IntStack {
    void push(int item); //
    int pop(); //

    //
    //
    //
    default void clear(){
        System.out.println(" method clear() not implemented");
    }
}
