import java.util.Scanner;

public class SalesCommission {
    // exammple 9

    static void findCommission() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Sales Id");
        int id = scanner.nextInt();
        System.out.println("Enter the Name");
        String name = scanner.next();
        System.out.println("Enter the Sales Amount");
        double salesamount = scanner.nextDouble();
        System.out.println("Enter the Basic Salary");
        double salary = scanner.nextDouble();

        if (salesamount>= 50000){
            //35% Commission
            double comvalue = (salesamount * .35f) ;
            System.out.println("Your commission is " + comvalue);

        }else if(salesamount>=30000){
            //20% Commission
            double comvalue = (salesamount * .20f) ;
            System.out.println("Your commission is " + comvalue);

        }else if(salesamount>=20000){
            //10% Commission
            double comvalue = (salesamount * .10f) ;
            System.out.println("Your commission is " + comvalue);

        }else if(salesamount>=10000){
            //5% Commission
            double comvalue = (salesamount * .05f) ;
            System.out.println("Your commission is " + comvalue);

        }else{
            //2% Commission
            double comvalue = (salesamount * .02f) ;
            System.out.println("Your commission is " + comvalue);

        }
    }


    public static void main(String[] args){

        findCommission();

    }
}

