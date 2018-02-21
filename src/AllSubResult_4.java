import java.util.Scanner;

 class AllSubResult_4 {
        // homework example 4
    static void FindResult(){
        int total;
        int percent;
        String result;
        String grade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Students Name");
        String name = scanner.next();
        System.out.println("Enter Students RollNo ");
        int rollno = scanner.nextInt();

        System.out.println("Enter Maths Marks");
        int math = scanner.nextInt();
        System.out.println("Enter English Marks");
        int eng = scanner.nextInt();
        System.out.println("Enter Science Marks");
        int sci = scanner.nextInt();

        total = math + eng + sci ;
        System.out.println("Total Marks : " + total);

        percent = total /3;
        System.out.println("Percentage is : " + percent + "%");

        if (math >=35){
            if (eng>=35){
                if(sci >=35){
                    System.out.println("PASS");
                }
            }
        }else{
            System.out.println("FAIL");
        }
    }

    public static void main(String args[]){
        FindResult();

    }

}
