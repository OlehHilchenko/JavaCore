package main.java.com.OlehHilchenko.javacore.Chapter04;

//applying left shift as a quick way to multiply

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xffffffe;

        for(i = 0; i < 4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
}
