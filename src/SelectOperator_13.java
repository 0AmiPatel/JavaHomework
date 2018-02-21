import java.util.Scanner;

public class SelectOperator_13 {

    //HOMEWORK TASK 13
    static void chooseOperator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the value");
        int val1 = scanner.nextInt();
        System.out.println( "Enter the value");
        int val2 = scanner.nextInt();
        System.out.println( "Enter the operator");
        char val3 = scanner.next().charAt(0);

        if(val3 == '+'){
            System.out.println(val1 + val2);

        }else if(val3== '-'){

            System.out.println(val1  - val2);
        }else if(val3== '/'){
                if(val1<val2){
                    System.out.println("value1 should not be less than value2. Enter valid value");

                }else {
                    System.out.println(val1 / val2);
                }
        }else if (val3== '*'){
            System.out.println(val1 * val2);
        }else {

            System.out.println("invalid operator");
        }
    }


    public static void main (String[] args){
        chooseOperator();

    }
}
