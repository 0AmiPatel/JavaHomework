import java.util.Scanner;

public class PrintaDay_15 {

    //Homework no 15
    static void day9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the number between 1 and  7");
        int numberOfDay = scanner.nextInt();

        if(numberOfDay == 1) {
            System.out.println("Sunday");
        }else if(numberOfDay == 2){
            System.out.println("Monday");
        }else if(numberOfDay == 3) {
            System.out.println("Tuesday");
        }else if(numberOfDay == 4) {
            System.out.println("Wednesday");
        }else if(numberOfDay == 5) {
            System.out.println("Thursday");
        }else if(numberOfDay == 6) {
            System.out.println("Friday");
        }else if(numberOfDay == 7) {
            System.out.println("Saturday");
        }else {
            System.out.println("Invalid");
        }

    }
    public static void main(String[] args){


    }


}
