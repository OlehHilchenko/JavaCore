package main.java.com.OlehHilchenko.javacore.Chapter07;

//
//
class Stack2{
    private int stck[];
    private int tos;

    //
    Stack2(int size){
        stck = new int[size];
        tos = -1;
    }

    //
    void puhs (int item){
        if (tos == stck.length - 1)//
            System.out.println("Full stack! ");
        else
            stck[++tos] = item;
    }

    //
    int pop(){
        if (tos < 0){
            System.out.println("No item in stack!");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

        //
        for (int i = 0; i < 5; i++) mystack1.puhs(i);
        for (int i = 0; i < 8; i++) mystack2.puhs(i);

        //
        System.out.println("Stack in mystack1: ");
        for(int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
