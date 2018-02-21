import java.util.Scanner;

 class OddEven {
     // exammple 1

    static void EnterNum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check if its ODD or EVEN");
        int num = sc.nextInt();

        System.out.println ( (num %2 == 0 ) ? "Even" : "Odd" );

    }


    public static void main(String[] args){
        EnterNum();
        }
}

