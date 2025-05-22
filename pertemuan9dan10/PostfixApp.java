package pertemuan9dan10;

import java.util.Scanner;

public class PostfixApp {
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input;
        int output;

        while (true) {
            System.out.print("Enter postfix: ");
            input = getString();
            if (input.equals("")) break;

            ParsePost parser = new ParsePost(input);
            output = parser.doParse();
            System.out.println("Hasil Operasi: " + output);
        }
    }

    public static String getString() {
        return scanner.nextLine();
    }

}
