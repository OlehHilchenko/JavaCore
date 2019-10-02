package main.java.com.OlehHilchenko.javacore.Chapter07;

//demonstrate method overload
public class OverloadDemo {
    void test(){
        System.out.println("No options ");
    }

    //Overloaded method that checks for the presence of one integer parameter
    //
    void test(int a) {
        System.out.println("a: " + a);
    }

    //two integer parameters
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    //Overloaded method that checks for the presence of a parameter of type double
    //
    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        //
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Call Result ob.test(123.25)" + result);
    }

}