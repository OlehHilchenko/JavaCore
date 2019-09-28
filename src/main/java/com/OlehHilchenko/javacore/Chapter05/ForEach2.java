package main.java.com.OlehHilchenko.javacore.Chapter05;
//break in for loop(in style for each)
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        //use for in style for each for output and
        //summation part of array values
        for (int x : nums){
            System.out.println("value equal: " + x);
            sum += x;
            if(x == 5) break; //interrupt the loop after receiving five values
        }
        System.out.println("Sum of first 5 values is: " + sum);
    }
}
