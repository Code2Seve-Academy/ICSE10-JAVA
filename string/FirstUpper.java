// 4. ✏️ Write a program to accept a string and
//  change the first character of every word
//   to upper case . [ICSE- 2018]
// Sample Input:  code2Serve academy is loved by all
// Sample Output: Code2Serve Academy Is Loved By All

import java.util.Scanner;

public class FirstUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String res = "";
        int len = str.length();
        char ch, prev;

        if (len > 0) {
            ch = str.charAt(0);

            res += String.valueOf(ch).toUpperCase();
        }

        for (int i = 1; i < len; i++) {
            ch = str.charAt(i);
            prev = str.charAt(i - 1);

            if (prev == ' ') {
                if (ch >= 97 && ch <= 122) {
                    ch -= 32;
                }
            }

            res += ch;

        }

        System.out.println(res);

    }
}
