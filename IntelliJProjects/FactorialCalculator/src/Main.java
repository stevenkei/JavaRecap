import java.util.Scanner;

class Main {
    public static int FirstFactorial(int num) {
        // code goes here
        int addNumber = 0;
        //int i = num-1;


        //for i is less than num loop
        for(int i = num-1; i <= num; i--) {
            if (i == 0) { break;}
            else
            {
                addNumber = num * i;
                num = addNumber;
            }
        }
        return num;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number to calculate the Factorial: ");
        System.out.print(FirstFactorial((s.nextInt())));
        System.out.println();
    }
}