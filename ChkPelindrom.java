import java.util.Scanner;

public class ChkPelindrom {
        // if reverse is equal to its original entered numbee then its pallindrom
    public static void main(String args[])
    {
        int remainder;
        int rev=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = scan.nextInt();

        int original = num;

        while(num != 0)
        {
            remainder = num%10;
            rev = rev*10 + remainder;//  rev = 50*10 + 6  --> 506*10 +2
            num = num/10;   //divide by 10 to decrease one digit


        }

        // check if the original number is equal to its reverse

        if(rev==original)
        {
            System.out.print("This is a Palindrome Number");
        }
        else
        {
            System.out.print("This is not a Palindrome Number");
        }
    }



}


