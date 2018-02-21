import java.util.Scanner;
            // exammple 10
public class CityAtoF_10 {

    static void printCityName(){

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter an Alphabet between A & F");
        String val_Alphabet = scanner.next();
      char x = val_Alphabet.charAt(0);
        System.out.println(x);
        if(val_Alphabet.equals ("a") || val_Alphabet.equals ("A"))  {
            System.out.println("Ahmedabad");
        }else if (val_Alphabet.equals ("b")|| val_Alphabet.equals ("B"))
        {
            System.out.println("Banglore");
        }else if (val_Alphabet.equals("c")|| val_Alphabet.equals ("C")) {
            System.out.println("Chennai");

        }else if (val_Alphabet.equals("d") || val_Alphabet.equals ("D")) {
            System.out.println("Delhi");

        }else if (val_Alphabet.equals("e")|| val_Alphabet.equals ("E")) {
            System.out.println("Eastbury");

         }else if (val_Alphabet.equals("f")|| val_Alphabet.equals ("F")) {
            System.out.println("Faridabad");
        }else {
            System.out.println("Invalid");
    }

    }

    public static void main(String[] args){
    printCityName();


    }
}
