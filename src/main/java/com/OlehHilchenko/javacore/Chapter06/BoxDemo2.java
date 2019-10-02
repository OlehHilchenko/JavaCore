package main.java.com.OlehHilchenko.javacore.Chapter06;

//in this program two class Box objects are declared
import main.java.com.OlehHilchenko.javacore.Chapter06.BoxDemo;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //assign values to instance variables mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //assign values to instance variables mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //calculate the volume of the first parallelepiped
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("" + vol);

        //calculate the volume of the second box
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("" + vol);
    }
}
