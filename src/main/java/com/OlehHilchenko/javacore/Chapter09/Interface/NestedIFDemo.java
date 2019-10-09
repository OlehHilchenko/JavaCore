package main.java.com.OlehHilchenko.javacore.Chapter09.Interface;

//
//
class A {
    //
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}

//
class B implements A.NestedIF{
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class NestedIFDemo {
    public static void main(String[] args) {

        //
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("number 10 is not negative");
        if(nif.isNotNegative(-12))
            System.out.println("it will not be displayed");
    }
}
