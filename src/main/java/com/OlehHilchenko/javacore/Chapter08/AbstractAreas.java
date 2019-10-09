package main.java.com.OlehHilchenko.javacore.Chapter08;
//
abstract class Figure2{
    double dim1;
    double dim2;

    Figure2(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    //
    abstract double area();
}

class Rectangle2 extends Figure2{
    Rectangle2(double a, double b){
        super(a, b);
    }

    //
    double area(){
        System.out.println("in the quadrangle ");
        return dim1 * dim2;
    }
}

class Triangles2 extends Figure2{
    Triangles2(double a, double b){
        super(a, b);
    }

    //
    double area (){
        System.out.println("in the area of the triangle");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(9, 5);
        Triangles2 t = new Triangles2(10, 8);
        Figure2 figure; //

        figure = r;
        System.out.println("the area is " + figure.area());

        figure = t;
        System.out.println("the area is " + figure.area());
    }
}
