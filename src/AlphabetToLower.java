import java.util.Scanner;
        // HOMEWORK TASK 12
public class AlphabetToLower {

    public static void convertInLowercase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet in Uppercase");
        String s = sc.next();
        System.out.println(s.toLowerCase());

    }



    public static void main (String[] args){

            convertInLowercase();
    }
}
