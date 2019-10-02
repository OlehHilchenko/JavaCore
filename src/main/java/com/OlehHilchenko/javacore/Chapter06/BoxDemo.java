package main.java.com.OlehHilchenko.javacore.Chapter06;

//application, using class Box
//give the source file a name BoxDemo.java
class Box {
    double width;
    double height;
    double depth;

    //non-parameterized class Box constructor
    Box(){
        System.out.println("non-parameterized class Box constructor ");
        System.out.println("Construct class Box. ");
        width = 10;
        height = 10;
        depth = 10;
    }

    //
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //print the volume of the box
    void volume() {
        System.out.print("volume is equal ");
        System.out.println(width * height * depth);
    }

    //calculate and return volume
    double volumeTwo (){
        return width * height * depth;
    }

    //set the dimensions of the box
    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

//this class declares an object of type box
class BoxDemo{
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        //assign value to instance variables mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //calculate parallelepiped volume
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("volume is equal " + vol);
    }
}