package main.java.com.OlehHilchenko.javacore.Chapter06;

/*This class defines an integer stack in which
 can store up to 10 integer values*/
public class Stack {
    int stck [] = new int [10];
    int tos;

    //initialize top of stack
    Stack(){
        tos = -1;
    }

    //place an item on the stack
    void push (int item) {
        if (tos == 9)
            System.out.println("the stack is full");
        else
            stck[++tos] = item;
    }

    //pop item from stack
    int pop (){
        if (tos < 0){
            System.out.println("the stack is not loaded");
            return 0;
        } else
            return stck[tos--];
    }
}
