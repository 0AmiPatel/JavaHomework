import java.util.Scanner;

public class CheckVowel {

        // example 17
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Alphabet : ");
        char ch = scan.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                System.out.print("This is a Vowel");
            } else {
                System.out.print("you have entered Consonant");
            }
        }else{
            System.out.print("please input an Alphabet");

        }

    }
}

