import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String LongestWord(String sen) {
        // code goes here

        //remove punctuation from the string
        String removedPunctStr = sen.replaceAll("\\p{Punct}", "");
        sen = removedPunctStr;

        //create ArrayList called words to store all the separate words
        ArrayList<String> words = new ArrayList<String>();

        //create variable to hold word to compare
        String comparedWord = "";

        for(int i = 0; i < sen.length(); i++)
        {
            //add word to comparedWord variable
            comparedWord += sen.charAt(i);


            if(comparedWord.contains(" ") || sen.length() == (i+1)) {
                comparedWord = comparedWord.trim();
                //if the word contains a space, add to array and wipe the variable to start again.
                words.add(comparedWord);
                comparedWord = "";
            }
        }

        String longestWord = "";

        for(String str : words)
        {
            if(str.length() > longestWord.length())
            {
                longestWord = str;
            }
        }
        sen = longestWord;

        return sen;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter words to finish the Longest one: ");
        System.out.println(" ");
        System.out.print("The longest word is:" + LongestWord(s.nextLine()));
    }
}