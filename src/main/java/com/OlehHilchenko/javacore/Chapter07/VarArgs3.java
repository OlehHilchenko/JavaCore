package main.java.com.OlehHilchenko.javacore.Chapter07;

//
public class VarArgs3 {
    static void vaTest(int ... v){
        System.out.print("vaTest(int...): " + "number of arguments: " +
                v.length + " content: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean...): " + "number of arguments: " +
                v.length + " content: ");

        for (boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(String, int...): " + msg + v.length + " Content: "  );

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Test: ", 10, 20);
        vaTest(true, false, false);
    }
}
