import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello, crate your character");
        System.out.println("First, tell me what`s your name?");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        System.out.println("Ok. So you are "+ name +", nice to met you. Please tell now, you are woman or man?");
        String gender = reader.readLine();

        System.out.println("So you are a "+gender+". In our adventure everything is important. Every action can change a story. " +
                "Probably you know something about butterfly effect? Yes, it`s something like this. Have fun!");

    }
}
