import java.util.Scanner;

public class Main {

    public static int FirstFactorial(int num) {
        // code goes here
        int addNumber = 0;

        //for i is less than num loop
        for(int i = num-1; i <= num; i--) {
            if (i == 0) { break;}
            else
            {
                addNumber = num * i;
                num = addNumber;
            }
        }
        System.out.println("Calculating....");
        System.out.print("Factorial output: ");
        return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a Number to calculate the Factorial: ");
        System.out.print(FirstFactorial(s.nextInt()));
    }
    }