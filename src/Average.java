import java.util.Scanner;

 class Average {
        // example 7
    static void  avgOfnum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the first value ");
        double a = scanner.nextDouble();


        System.out.println( "Enter the second value ");
        double b = scanner.nextDouble();

        System.out.println( "Enter the third value ");
        double c = scanner.nextDouble();


        System.out.println( "Enter the fourth value ");
        double d = scanner.nextDouble();


        System.out.println( "Enter the fifth value");
        double e = scanner.nextDouble();
        double avg = a+b+c+d+e/5;
        System.out.println( "Average is: "+ avg);

    }



    public static void main (String args[]){
        avgOfnum();
    }

}
