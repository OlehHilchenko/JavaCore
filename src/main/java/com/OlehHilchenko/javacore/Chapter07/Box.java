package main.java.com.OlehHilchenko.javacore.Chapter07;

class Box {
    double width;
    double height;
    double depth;

    //pay attention to this constructor
    //as a parameter it uses an object of type Box
    Box(Box ob){//pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //non-parameterized class Box constructor
    Box(){
        System.out.println("non-parameterized class Box constructor ");
        System.out.println("Construct class Box. ");
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    //parameterized class Box constructor
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

