package main.java.com.OlehHilchenko.javacore.Chapter08;

//
class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("area of figure e is determined");
        return  0;
    }
}

class Rectangle extends Figure {
    Rectangle (double a, double b){
        super(a, b);
    }

    //
    double area(){
        System.out.println("in the quadrangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    //
    double area (){
        System.out.println("in the area of the triangle");
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figure;

        figure = r;
        System.out.println("the area is " + figure.area());

        figure = t;
        System.out.println("the area is " + figure.area());

        figure = f;
        System.out.println("the area is " + figure.area());
    }
}
