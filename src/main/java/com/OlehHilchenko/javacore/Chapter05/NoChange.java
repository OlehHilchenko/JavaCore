package main.java.com.OlehHilchenko.javacore.Chapter05;
//variable of loop in style foreach available only for read
public class NoChange {
    public static void main(String[] args) {
        int nums [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // this operator does not have any effect on the array nums

        }

        System.out.println();

        for (int x : nums)
            System.out.print(x + " ");
        System.out.println();
    }
}
