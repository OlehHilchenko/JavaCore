package main.java.com.OlehHilchenko.javacore.Chapter06;

//
public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

        //
        System.out.println("Volume equal " + mybox1.volumeTwo());

        //
        System.out.println("Volume equal " + mybox2.volumeTwo());
    }
}
