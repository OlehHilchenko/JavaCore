package main.java.com.OlehHilchenko.javacore.Chapter05;

//cycle application for in style for each

public class ForEach {
    public static void main(String[] args) {
        int nums [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        //use for in style for each for output and
        //summation of values
        for(int x : nums){
            System.out.println("Value equal: " + x);
            sum += x;
        }

        System.out.println("Sum is: " + sum);
    }
}
