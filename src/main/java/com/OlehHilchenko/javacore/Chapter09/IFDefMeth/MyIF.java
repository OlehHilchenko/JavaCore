package main.java.com.OlehHilchenko.javacore.Chapter09.IFDefMeth;

public interface MyIF {
    //
    //
    int getNumber();

    //
    //
    default String getString () {
        return "default object of string type";
    }

    //
    static int getDefaultNumber(){
        return 0;
    }
}
