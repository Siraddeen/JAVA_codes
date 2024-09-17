import  java.util.Scanner;
public class exer4_19 
{
    public static void main(String[] args) {

        /*
        System.out.println("gove 1 marls");
        Scanner a1 = new Scanner(System.in);
        float m1 = a1.nextFloat();

        System.out.println("gove 2 marls");
        Scanner a2 = new Scanner(System.in);
        float m2 = a2.nextFloat();

        System.out.println("gove 3 marls");
        Scanner a3 = new Scanner(System.in);
        float m3 = a3.nextFloat();


        float average = (m1+m2+m3)/3;
        System.out.println(average);
        if(average>40){
            System.out.println("passed");
        } else if (average>33) {
            System.out.println("just pass");
        }else {
            System.out.println("fail");
        }
 */


        // leap year
        System.out.println("give a year number");
        Scanner ye = new Scanner(System.in);
        float leapYear = ye.nextFloat();
        if(leapYear % 4 ==0 ){
            System.out.println("this is a leap year");
        }else {
            System.out.println("not a leap year");
        }

    }
}
