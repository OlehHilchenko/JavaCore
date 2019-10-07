package main.java.com.OlehHilchenko.javacore.Chapter07;

//
//
public class VarArgs2 {
    //
    //
    static void vaTest(String msg, int ... v){
        System.out.print(msg + v.length + " Content: "  );

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("one variable length parameter", 10);
        vaTest("three variable length parameters", 1, 2, 3);
        vaTest("without variable length parameters");
    }
}
