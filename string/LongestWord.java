/*
 * 
 * 5. ✏️ Write a program to accept a string and
 *  print the length of the longest word in the 
 *  given string . [ICSE- 2009]

Sample Input:  code2Serve academy is loved by all
Sample Output: 10
 */
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = 0, len = str.length(), longest = 0, count = 0;
        char ch;

        for (int i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch == ' ' || i == len - 1) {
                count = str.substring(start, i).length();

                if (count > longest) {
                    longest = count;
                }
                start = i + 1;

            }

        }

        System.out.print(longest);

    }
}
