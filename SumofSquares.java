public class SumofSquares {



    public static void main(String args[]) {

        int i;
        int result=0;

        for (i = 1; i <= 100; i++)
        {
        result = result + (i*i);
        }

        System.out.print("Sum of Squares is " + result);
    }
}
