import  java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Going to print % of student");

        System.out.println("give s1 marks");
        Scanner sub1 = new Scanner(System.in);
        int s1 = sub1.nextInt();
        System.out.println("give s2 marks");
        Scanner sub2 = new Scanner(System.in);
        int s2 = sub2.nextInt();
        System.out.println("give s3 marks");
        Scanner sub3 = new Scanner(System.in);
        int s3 = sub3.nextInt();
        System.out.println("give s4 marks");
        Scanner sub4 = new Scanner(System.in);
        int s4 = sub4.nextInt();
        System.out.println("give s5 marks");
        Scanner sub5 = new Scanner(System.in);
        int s5 = sub5.nextInt();

        int average = ((s1+s2+s3+s4+s5)/5);

        System.out.println("the overall percentage of score is " + average+"%");


        // check if given input is int  via boolean
        System.out.println("give a number");
        Scanner num = new Scanner(System.in);
        boolean intt = num.hasNextInt();
        System.out.println("the given input is int "+ intt);
    }
}
