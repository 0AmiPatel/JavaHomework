import java.util.Scanner;
        //fibonasci
public class FibonacciSeries {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n number");
        int x = sc.nextInt();

        int i=0;
        int j=1;
        int result;
        System.out.print(i + " " + j);

        for (int z=0; z <= x; z++) {
            result =i+ j;

            i=j;
            j=result;
            System.out.print( " " + result);

        }

    }


}
