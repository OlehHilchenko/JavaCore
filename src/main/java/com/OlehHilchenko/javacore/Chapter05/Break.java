package main.java.com.OlehHilchenko.javacore.Chapter05;

//operator application break
//as a civilized form operator goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("preceded by operator break.");
                    if (t) break second; // exit out bloc second
                    System.out.println("This statement will not be executed ");
                }
                System.out.println("This statement will not be executed ");
            }
            System.out.println("This statement follows the block second.");
        }
    }
}
