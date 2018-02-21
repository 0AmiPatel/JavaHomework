import java.util.Scanner;

 class StudentResult {
        //// exammple 3

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
        System.out.println("Percentage is : " + percent);
        if (percent >=35){
                if(percent>=80){
                    System.out.println("Grade A+");
                }else if(percent>=60){
                    System.out.println("Grade A");
                }else if(percent>=50){
                    System.out.println("Grade B");
                }else{
                    System.out.println("Grade C");
                }

        }else{
            System.out.println("Fail");
        }
    }

    public static void main(String args[]){
        FindResult();

    }




}



