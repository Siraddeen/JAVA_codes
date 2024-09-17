import java.util.Scanner;

public class if_else_18 {
    public static void main(String[] args) {
        System.out.println("give your afe : ");
        Scanner a = new Scanner(System.in);

        int age = a.nextInt();

        // switch
        switch (age) {
            case 18 -> System.out.println("ok maN");
            case 10 -> System.out.println("2 try");
        }
        System.out.println("out of switch");


        /*  // if else
        if(age>50){
            System.out.println("abokaafd");
        } else if (age>30) {
            System.out.println("30 is ij");
        }else if (age>20) {
            System.out.println("20 is ij");
        }else {
            System.out.println("gp aeay");
        }

         */
    }
}
