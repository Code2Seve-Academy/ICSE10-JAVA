
import java.util.Scanner;

// 3. ✏️ Write a program to accept a string
//  and display the text with uppercase and 
//  lowercase reversed . [ICSE- 2008]
// Sample Input:  Code2Serve Academy
// Sample Output: cODE2sERVE aCADEMY
public class ReverseCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (ch >= 65 && ch <= 90) {
                ch += 32;
            } else if (ch >= 97 && ch <= 122) {
                ch -= 32;
            }

            res += ch;

        }

        System.out.println(res);

    }

}
