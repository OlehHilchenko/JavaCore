package main.java.com.OlehHilchenko.javacore.Chapter09.p2;


public class Protection2 extends main.java.com.OlehHilchenko.javacore.Chapter09.p1.Protection{

    Protection2(){
        System.out.println(
                "constructor inherited from another package"
        );
        //
        //System.out.println("n = " + n);

        //
        //System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
