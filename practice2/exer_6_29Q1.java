import java.util.Scanner;
public class exer_6_29Q1 {

    public static void main(String[] args) {
        // sum of 5 floats from array

        /*  my way
        System.out.println("give 5 vakues of marks");
        Scanner m1 = new Scanner(System.in);
        float m11 = m1.nextFloat();
        Scanner m2 = new Scanner(System.in);float m22 = m2.nextFloat();
        Scanner m3 = new Scanner(System.in);float m33 = m3.nextFloat();
        Scanner m4 = new Scanner(System.in);float m44 = m4.nextFloat();
        Scanner m5 = new Scanner(System.in);float m55 = m5.nextFloat();

        float all = (m11+m22+m33+m44+m55 );
        System.out.println("total is " + all);
        int [] mark = new int [5] ;
        */

        //detailed way
        Scanner markScan = new Scanner(System.in);
        System.out.println("give 5 values of marks");
        float [] marks = new float[5];

        for(int i=0;i<marks.length;i++){
            System.out.println("enter marks " +(i+1)+ ": ");
            marks[i] = markScan.nextFloat();
        }

        float total = 0;
        for( float i:marks){
            total += i;
        }
        for(float i:marks){
            System.out.print(i +" ");
        }
        System.out.println("\n");
        System.out.println("total score : "+total);
        markScan.close();
        System.out.println("\n");
        float avg = total/5;
        System.out.println("The average score is : " + avg);
    }
}
