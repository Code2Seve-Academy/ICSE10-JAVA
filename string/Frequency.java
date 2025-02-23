
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //Array to store the count of each character 
        //Count for A -> index 0 
        //Count for B -> index 1 
        // ...
        //Count for Z -> index 25
        int arr[] = new int[26];
        str = str.toUpperCase();
        char ch;
        int index;
        //To count the freq and store the same in the array
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                index = ch - 65; //to get the index in the array to keep the count
                arr[index]++;
            }

        }

        //To print the characters
        System.out.print("CHARACTERS    ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ch = (char) (i + 65);
                System.out.print(ch + " ");
            }
        }

        //To print the Frequency
        System.out.print("\nFREQUENCY    "); //"\n" to first go to next line then print FREQUENCY or we can also add Sopln() above this line
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
