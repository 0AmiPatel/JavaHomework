import java.util.Scanner;

public class PrintTable {

        //EXAMPLE 11
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter table number");
        int x = sc.nextInt();


        int j;
        int result;
        for (int i=1; i<=x;i++) {
            for (j = 1; j <= 10; j++) {

                result = i * j;
                System.out.print(result + "  ");
            }
            System.out.println( "\n");

        }


    }
}
