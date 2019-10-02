package main.java.com.OlehHilchenko.javacore.Chapter07;

//
public class OverloadCons {
    public static void main(String[] args) {
        //create box, use different constructor
        //
        Box mybox1 = new Box(10, 20 ,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //get the volume of the box
        vol = mybox1.volumeTwo();
        System.out.println("Volume mybox1 equal " + vol);

        //get the volume of the box
        vol = mybox2.volumeTwo();
        System.out.println("Volume mybox2 equal " + vol);

        //get the volume of a cube
        vol = mycube.volumeTwo();
        System.out.println("Volume mycube equal " + vol);

    }
}
