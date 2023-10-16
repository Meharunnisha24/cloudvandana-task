import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        long result = 0L;
        
        for (int i = 0; i < s.length(); i++) {
            int cu = getValue(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = getValue(s.charAt(i + 1));
                if (cu >= next)
                    result += cu;
                else
                    result -= cu;
            } else {
                result += cu;
            }
        }
        
        System.out.println(result);
        sc.close();
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}
