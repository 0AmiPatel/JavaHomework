import java.util.Scanner;

public class SumFirstLast {
    public static void main(String args[]) {

        int rem;
        int x=1;
        int sum =0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter only FIVE DIGIT NUBMER");
        int number = s.nextInt();

        while (number > 0) {
            rem = number % 10;

            if((x==1) ||  (x==5)){
                sum =sum+ rem;
                }
            x++;
            number = number / 10;
        }

        System.out.println("sum of FIRST & LAST DIGIT:" + sum);



    }
}
