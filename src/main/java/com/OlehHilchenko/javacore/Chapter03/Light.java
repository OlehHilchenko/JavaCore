package main.java.com.OlehHilchenko.javacore.Chapter03;
/**Calculate the distance traveled by light.
   Use variable type is long */
public class Light {

    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        //Approximate speed of light, miles per second.
        lightspeed = 186000;

        days = 1000;// Indicate quantity days.

        seconds = days * 24 * 60 * 60; //Convert in seconds.

        distance = lightspeed * seconds; //Calculate distance.

        System.out.print("Per " + days);
        System.out.print(" days light will pass approximate ");
        System.out.println(distance + " miles.");
    }
}
