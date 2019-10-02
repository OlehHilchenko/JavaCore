package main.java.com.OlehHilchenko.javacore.Chapter07;

public class OverloadCons2 {
    public static void main(String[] args) {
        //create boxes
        //use different constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        //create copy of mybox1
        Box myclone = new Box(mybox1);

        double vol;

        //
        vol = mybox1.volumeTwo();
        System.out.println("Volume mybox1 equal " + vol);

        //
        vol = mybox2.volumeTwo();
        System.out.println("Volume mybox2 equal " + vol);

        //
        vol = mycube.volumeTwo();
        System.out.println("Volume mycube equal " + vol);

        //
        vol = myclone.volumeTwo();
        System.out.println("Volume myclone equal " + vol);
    }
}
