import java.util.Scanner;

public class SumOfDigits {



    public static void main(String args[]) {

        int remainder, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter only FIVE DIGIT NUBMER");
        int number = s.nextInt();

        while (number > 0) {

            remainder = number % 10;
            sum += remainder;
            number = number / 10;

        }
        System.out.println("sum of FIVE DIGITS" + sum);

    }

}
