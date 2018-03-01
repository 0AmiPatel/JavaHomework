import java.util.Scanner;

public class PrimeNum {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Number :");
        int i = sc.nextInt();


            int count = 0;
            for(int j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.println( i + " is prime number");
            }else{

                System.out.println(i + "is not prime number");
            }

    }

}
