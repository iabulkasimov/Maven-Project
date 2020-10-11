package call.hello;

public class App
{

    private final String message = "Hello World from Java Maven Project!";
    private final String message1 = "Hello World from Java and second try!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
	System.out.println(new App().getMessage1());
    }

    private final String getMessage() {
        return message;
    }

    private final String getMessage1() {
        return message1;
    }

}
