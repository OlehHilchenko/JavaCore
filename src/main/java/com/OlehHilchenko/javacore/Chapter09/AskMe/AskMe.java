package main.java.com.OlehHilchenko.javacore.Chapter09.AskMe;

public class AskMe implements SharedConstants {
    static void ansver (int result){
        switch (result){
            case NO:
                System.out.println("NO!");
                break;
            case YES:
                System.out.println("YES!");
                break;
            case MAYBE:
                System.out.println("MAYBE!");
                break;
            case LATER:
                System.out.println("LATER!");
                break;
            case SOON:
                System.out.println("SOON!");
                break;
            case NEVER:
                System.out.println("NEVER!");
                break;

        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        ansver(q.ask());
        ansver(q.ask());
        ansver(q.ask());
        ansver(q.ask());

    }
}
