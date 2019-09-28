package main.java.com.OlehHilchenko.javacore.Chapter05;

//search in array using loop for in style for each
public class Search {
    public static void main(String[] args) {
        int nums [] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        boolean found = false;

        //use for in style for each
        //to search for the value of a variable val in array nums
        for(int x : nums){
            if (x == val) {
                found = true;
                break;
            }
        }

        if (found) System.out.println("Value is found!");
    }
}
