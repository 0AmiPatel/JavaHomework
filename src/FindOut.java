
import java.util.Scanner;

public class FindOut {
// find out if  entered value is letter or number or symbol- example 14

    static void EnterChar() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a single character: ");
        char ch = sc.next().charAt(0);


        if (ch >='a' || ch <='z'){
            System.out.println("The character entered is a letter.");
        } else if(ch >='0' && ch <='9') {

                    System.out.println("The character entered Number.");

                }else{

                    System.out.println("The character entered not a Number");
                }
        }

        public static void main(String[] args){
            EnterChar();

        }
}
