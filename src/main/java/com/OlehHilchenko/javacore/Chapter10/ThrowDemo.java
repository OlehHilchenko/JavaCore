package main.java.com.OlehHilchenko.javacore.Chapter10;
//
public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("Demo");
        }catch (NullPointerException e){
            System.out.println(
                    "exception caught in demoproc() method body");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("re-interception: " + e);
        }
    }
}
