import java.util.Scanner;

public class SumOfoddEven {
            //example 3
    public static void main(String args[]) {

            int remainder;
             int evensum=0;
            int oddsum = 0;
            int evencount=0;
            int oddcount=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter only FIVE DIGIT NUBMER");
        int number = s.nextInt();

        while (number > 0) {
            remainder = number % 10;

            if(remainder%2==0){
                evensum = evensum+ remainder;
                evencount++;

            }else{

                oddsum = oddsum+remainder;
                oddcount++;
            }

            number = number / 10;
        }
        System.out.println("total even DIGITS :" + evencount);
        System.out.println("total ODD DIGITS :" + oddcount);
        System.out.println("sum of EVEN DIGITS :" + evensum);
        System.out.println("sum of ODD DIGITS  :" + oddsum);


    }
}
