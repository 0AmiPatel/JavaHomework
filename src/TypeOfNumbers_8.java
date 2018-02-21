import java.util.Scanner;

 class TypeOfNumbers_8 {
     // exammple 8
    static void findTypeOfNum(){

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the value");
        int val = scanner.nextInt();
        if(val>0){
            System.out.println( "Value is Positive");
        }else if (val<0){
            System.out.println( "Value is Negative");

        }else{
            System.out.println( "Value is Zero");

        }



    }

    public static void main(String[] args){
        findTypeOfNum();

    }

}
