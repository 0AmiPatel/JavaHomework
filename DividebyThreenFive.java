import java.util.Scanner;

public class DividebyThreenFive {


    public static void main(String args[]) {

        int i;
        char j;

        System.out.print("Numbers divided by 3 :: ");

        for (i = 1; i <= 100; i++)
        {
            if (i % 3 == 0) {

                System.out.print(i + " ");

            }
        }

        System.out.print( "\n" + "Numbers divided by 5 ::");
        for (i = 1; i <= 100; i++)
            if (i % 5 == 0) {


                System.out.print( i + " ");

            }

    }
}
