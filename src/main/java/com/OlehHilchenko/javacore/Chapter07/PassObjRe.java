package main.java.com.OlehHilchenko.javacore.Chapter07;

//
class Test3{
    int a, b;

    Test3(int i, int j){
        a = i;
        b = j;
    }

    //
    void meth(Test3 o){
        o.a *= 2;
        o.b /= 2;
    }
}

//
public class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a and ob.b before calling: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after calling: " + ob.a + " " + ob.b);
    }
}
