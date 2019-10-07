package main.java.com.OlehHilchenko.javacore.Chapter07;

/*
* В этой программе демонстрируется отличие
* модификаторов public и private. */
class TestAccess{
    int a;          //доступ, определяемый по умолчанию
    public int b;   //открытый доступ
    private int c;  //закрытый доступ

    //методы доступа к члену с данного класса
    void setc(int i){ //установить значение члена с данного класса
        c = i;
    }

    int getc(){ //получить значение члена с данного класса
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        TestAccess ob = new TestAccess();
        //Эти операторы правильны, поэтому члены a и b
        //данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;
        //Этот оператор неверен и может вызвать ошибку
        //ob.c = 100; error!

        //Доступ к члену с данного класса должен осуществляться
        //с помощью методов ее класса
        ob.setc(100); // верно!
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
