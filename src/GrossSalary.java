import java.util.Scanner;

public class GrossSalary {
         // exammple 6
    // Count HRA-10% , TA -9%, DA -8%, PF - 20%, GROSS SALARY

    static void findGrossSalary() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Employee Id");
        int empid = scanner.nextInt();
        System.out.println("Enter the Employee Name");
        String empname = scanner.next();
        System.out.println("Enter the Basic Salary");
        double basicsal = scanner.nextDouble();

        double hra = basicsal * .10f;
        System.out.println("Your HRA is " + hra);
        double ta = basicsal * .09f;
        System.out.println("Your TA is " + ta);
        double da = basicsal * .08f;
        System.out.println("Your DA is " + da);
        double pf = basicsal * .20f;
        System.out.println("Your gross PF is " + pf);
        double salgross = (hra + ta + da)- pf ;


        System.out.println("Your gross salary is " + salgross);

        }



    public static void main(String[] args){

        findGrossSalary();

    }



}
