// ✏️ Write a Java method to check if a
// string is a palindrome.

// Sample Input:  Code2Serve Academy
// Sample Output: false
// Sample Input:  LOL
// Sample Output: true
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        char ch;

        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            rev = rev + ch;
        }

        if (str.equals(rev)) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }

    }

}
