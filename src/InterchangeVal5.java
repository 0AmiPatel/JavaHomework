import java.util.Scanner;

public class InterchangeVal5 {
    //HOMEWORK EXAMPLE 5

    static void intchangeVal(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value of a");
        int a= sc.nextInt();
        System.out.println("Please enter value of b");
        int b= sc.nextInt();
        int temp = a;
        a =b;
        b= temp;

        System.out.println("Value of a is now changed to " + a);
        System.out.println("Value of b is now changed to " + b);


    }

    public static void main (String args[]){

        intchangeVal();
    }


}
