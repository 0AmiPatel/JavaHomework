import java.util.Scanner;

public class NprimeNum {

    public static void main(String args[])
    {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n Number : ");
        int n = scan.nextInt();

        for(int i=0; i<=n; i++)
        {
            int count = 0;
            for(int j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;

                }
            }
            if(count == 0)
            {
                System.out.println("Prime Numbers are :"  + i );
            }
        }
    }
}
