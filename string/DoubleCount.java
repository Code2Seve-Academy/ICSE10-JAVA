// 6. ✏️ Write a program to accept a string
//  and convert the string to uppercase display 
//  the number of double letter sequence in the given string . [ICSE- 2012]

// Sample Input:  code2Serve academy is loved by all
// Sample Output: 1
import java.util.Scanner;

public class DoubleCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch;
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            ch = str.charAt(i);
            if (ch == str.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count);

    }
}
