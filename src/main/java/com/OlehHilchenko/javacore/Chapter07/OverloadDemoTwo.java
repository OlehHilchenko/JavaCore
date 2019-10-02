package main.java.com.OlehHilchenko.javacore.Chapter07;

//Apply automatic type conversion to overload
public class OverloadDemoTwo {
    void test() {
        System.out.println("No options ");
    }

    //Overloaded method that checks for the presence of two integer parameters
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    //Overloaded method that checks for the presence of a parameter of type double
    void test(double a) {
        System.out.println("Internal conversion on call test (double) a: " + a);
    }

}

class OverloadTwo{
    public static void main(String[] args) {
        OverloadDemoTwo ob = new OverloadDemoTwo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); //here is called the double method variant
        ob.test(123.2); //here is called the double method variant
    }

}