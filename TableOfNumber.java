import java.util.Scanner;

public class TableOfNumber {

    //Write a program in Java to display the multiplication table of a given integer


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter table number");
        int x = sc.nextInt();
        int j;
        int result;

            for (j = 1; j <= 10; j++) {

                result = x * j;
                System.out.println(x + " x " + j + " = " + result);
            }



    }
}
