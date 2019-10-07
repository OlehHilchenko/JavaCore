package main.java.com.OlehHilchenko.javacore.Chapter08;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Value weightbox is " + vol);
        System.out.println("Weight weightbix is " + weightbox.weight);
        System.out.println();

        //
        plainbox = weightbox;
        vol = plainbox.volume(); //
                                    //
        System.out.println("Value plainbox is " + vol);
        /*
        * ERROR
        * System.out.println("Weight plainbox is " plainbox.weight);*/
    }
}
