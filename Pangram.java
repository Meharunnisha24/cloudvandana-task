import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to check for a pangram:");
        String input = sc.nextLine();
        sc.close();

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        s = s.replaceAll(" ", "").toLowerCase();
        Set<Character> alphabet = new HashSet<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                alphabet.add(c);
            }
        }

        return alphabet.size() == 26;
    }
}
