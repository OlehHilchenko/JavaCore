package main.java.com.OlehHilchenko.javacore.Chapter05;

//advanced version of the program
//in which the month belongs to the time of year

public class Switch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "fictional month";
        }
        System.out.println("April refers to " + season + ".");
    }
}
