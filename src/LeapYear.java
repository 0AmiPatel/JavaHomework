import java.util.Scanner;

 class LeapYear {
     // exammple 2

    static void FindLeapYr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int yr = scanner.nextInt();
        if (yr % 2 == 0) {
            System.out.println(yr + " is a Leap year");
        } else {
            System.out.println(yr + " is not a Leap year");

        }
    }

    public static void main (String[] args){

        FindLeapYr();
    }
}
