package main.java.com.OlehHilchenko.javacore.Chapter06;

//in this application used method volume() introduced in class Box
public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //assign value to instance variables mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /*assign other values to instance variables mybox2
        mybox2 instance */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //output the volume of the first parallelepiped
        mybox1.volume();

        //output the volume of the second parallelepiped
        mybox2.volume();
    }
}
