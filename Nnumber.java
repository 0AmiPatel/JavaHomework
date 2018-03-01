import java.util.Scanner;

public class Nnumber {


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter n number");
        int x = sc.nextInt();


    int j;
    int result=0;

        for (j = 1; j <= x; j++) {
            System.out.print(j + "\n");
            result =result+ j;
        }
        System.out.println("Sum of Numbers is : "+ result);
        System.out.println( "Average :"+ result /x );
}
}
