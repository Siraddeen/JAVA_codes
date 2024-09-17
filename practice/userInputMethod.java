import  java.util.Scanner;
public class userInputMethod {
    public static void main(String[] args) {
        System.out.println("enter 1 number");
        Scanner a = new Scanner(System.in);
        int a1  = a.nextInt();
        System.out.println("enter 2 number");
        Scanner b = new Scanner(System.in);
        int b1  = a.nextInt();

        int all = a1+b1;


        System.out.println("total is " + all);



        // using a boolean
//    System.out.println("a number");
//    Scanner a = new Scanner(System.in);
//    boolean aa = a.hasNextInt();
//        System.out.println("the value of a " + aa);
    }
}
