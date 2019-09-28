package main.java.com.OlehHilchenko.javacore.Chapter05;

//simple operator application switch

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i equal zero.");
                    break;
                case 1:
                    System.out.println("i equal one");
                    break;
                case 2:
                    System.out.println("i equal two ");
                    break;
                case 3:
                    System.out.println("i equal three");
                    break;
                    default:
                        System.out.println("i more than three");
            }
    }
}
