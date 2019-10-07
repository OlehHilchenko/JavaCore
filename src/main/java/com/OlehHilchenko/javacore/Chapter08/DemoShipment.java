package main.java.com.OlehHilchenko.javacore.Chapter08;

import main.java.com.OlehHilchenko.javacore.Chapter08.Box1;
import main.java.com.OlehHilchenko.javacore.Chapter08.BoxWeight1;

class Shipment extends BoxWeight1{
    double cost;

    //
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    //
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);//
        cost = c;
    }

    //
    Shipment(){
        super();
        cost = -1;
    }

    //
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("value shipment1 is " + vol);
        System.out.println("waight shipment1 is " + shipment1.weight);
        System.out.println("cost of delivery: $ " + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("value shipment2 is " + vol);
        System.out.println("waight shipment2 is " + shipment2.weight);
        System.out.println("cost of delivery: $ " + shipment2.cost);
    }
}
