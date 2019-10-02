package main.java.com.OlehHilchenko.javacore.Chapter06;

//
public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i <20; i++) mystack2.push(i);

        //
        System.out.println("stack mystack1 contents: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("stack mystack2 contents: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}
