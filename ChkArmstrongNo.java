
import java.util.Scanner;
public class ChkArmstrongNo {



        public static void main (String args[])
        {


            int num = 0;
            int rem;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter any Number : ");
            int value = sc.nextInt();
            int nu = value;

            while (nu != 0) {
                rem = nu % 10;
                num = num + rem * rem * rem;
                nu = nu / 10;
            }
            if (num == value) {
                System.out.print("It is an Armstrong Number");
            } else {
                System.out.print("It is not an Armstrong Number");
            }
        }
    }

