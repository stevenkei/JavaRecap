import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String FirstReverse(String str) {
        // code goes here
        int length = str.length();
        String reverseString = "";

        for(int i = length-1; i >= 0; i--)
        {
               //System.out.print(str.charAt(i));
               reverseString += str.charAt(i);
        }
        return reverseString;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a word to reverse it: ");
        System.out.print(FirstReverse(s.nextLine()));
    }
}