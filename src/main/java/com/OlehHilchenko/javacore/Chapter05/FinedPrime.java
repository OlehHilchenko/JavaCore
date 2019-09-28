package main.java.com.OlehHilchenko.javacore.Chapter05;

//check for prime numbers

public class FinedPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num/i; i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime) System.out.println("prime number");
        else System.out.println("not prime number");
    }
}
