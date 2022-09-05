import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        boolean goodInput = false;
        int n = 0;
        // Get user input.
        Scanner input = new Scanner(System.in);
        while (!goodInput) {
            try {
                System.out.print("Please enter a value for n: ");
                n = input.nextInt();
                goodInput = true;
            } catch (InputMismatchException ime) {
                input.nextLine(); // Clear input buffer.
                System.out.println("INPUT ERROR: Please enter an integer value.");
                goodInput = false;
            }
        }
        input.close();
        // Calculate Fibonacci value.
        long result = recursiveFibSeq(n);

        char[] inputValue = Integer.toString(n).toCharArray();
        if (n >= 10 && inputValue[inputValue.length - 2] == '1') {
            System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
        } else {
            switch (inputValue[inputValue.length - 1]) {
                case '1':
                    System.out.println("The " + n + "st term of the Fibonacci sequence is " + result + ".");
                    break;
                case '2':
                    System.out.println("The " + n + "nd term of the Fibonacci sequence is " + result + ".");
                    break;
                case '3':
                    System.out.println("The " + n + "rd term of the Fibonacci sequence is " + result + ".");
                    break;
                default:
                    System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
                    break;
            }
        }
        
    }

    public static long recursiveFibSeq(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return recursiveFibSeq(n - 1) + recursiveFibSeq(n - 2); // F(n) = F(n-1) + F(n-2)
    }

}