import java.util.Scanner;

public class NestedLoop {

    //Display right angle triangle of @ using nested for loops

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int val = sc.nextInt();

        int i;
        char j;


    for( i=1; i<=val; i++)
        {


            for( j=1; j<=i; j++) {
                System.out.print(" @");
            }
            System.out.println( "");

        }

    }
}
