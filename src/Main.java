import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Call the pangrams function and print the result
        String result = pangrams(inputString);
        System.out.println("The input string is " + result);
    }

    public static String pangrams(String s) {
        s = s.toUpperCase();
        boolean[] alphabetOccurrence = new boolean[26];

        for (boolean b : alphabetOccurrence) {
            b = false;
        }
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch >= 'A' && ch <= 'Z') {
                alphabetOccurrence[ch - 'A'] = true;
            }
        }
        for (boolean occurred : alphabetOccurrence) {
            if (!occurred) {
                return "not pangram";
            }
        }

//        System.out.println(Arrays.toString(alphabetOccurrence));
        return "pangram";
    }
}