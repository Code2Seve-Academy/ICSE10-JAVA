// ✏️ Write a program to accept a string 
// and display the reversed string.

// Sample Input: Code2Serve Academy
// Sample Output: ymedacA evreS2edoC
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        char ch;

        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            rev = rev + ch;
        }

        System.err.println(rev);

    }

}
