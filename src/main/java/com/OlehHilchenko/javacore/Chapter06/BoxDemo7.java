package main.java.com.OlehHilchenko.javacore.Chapter06;

//
public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        //
        System.out.println("Volume equal " + mybox1.volumeTwo());

        //
        System.out.println("Volume equal " + mybox2.volumeTwo());
    }
}
