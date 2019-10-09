package main.java.com.OlehHilchenko.javacore.Chapter09.p2;


public class OtherPackage {
    OtherPackage(){
        main.java.com.OlehHilchenko.javacore.Chapter09.p1.Protection p =
                new main.java.com.OlehHilchenko.javacore.Chapter09.p1.Protection();
        System.out.println("constructor from another package");
        //
        //System.out.println("n = " + p.n);

        //
        //System.out.println("n_pri = " + p.n_pri);

        //
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
