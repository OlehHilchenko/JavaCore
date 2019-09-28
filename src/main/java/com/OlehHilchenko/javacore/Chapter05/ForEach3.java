package main.java.com.OlehHilchenko.javacore.Chapter05;

//cycle application for in style for each
//to access a two-dimensional array
public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        //assign value to array nums elements
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

        //use for in style for each for output and
        //summation of values
        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
