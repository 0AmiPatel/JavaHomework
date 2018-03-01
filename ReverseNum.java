import java.util.Scanner;

public class ReverseNum {

    //EXAMPLE 4


    public static void main(String argss[]){
        int rem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit number: ");
        int num = sc.nextInt();

        while(num >0) {
            rem = num % 10;

            System.out.print(rem);
            num= num/10;

        }



    }
}
