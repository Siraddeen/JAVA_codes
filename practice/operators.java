import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
// basically +,-,*,/,&& , || , == all these symbols are used in name of comparision assign logical and so on operators
        /*
        System.out.println("gave a number");
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        boolean d = (a>20 && a<45);
        System.out.println("valkai value "+ d);
        */

        // Increment & Decrement

        int a = 41;
        System.out.println(a++); // here a is used first then after only 1 added here a =41
        System.out.println(a); // now only 1 added so a =42

        int b =55;
        System.out.println(++b); // here first 1 added to int so here b =56
        System.out.println(b);

        int w = 23;
        System.out.println(--w);
        int t = 20;
        System.out.println(t--);
        System.out.println(t);

        char m = 'c';
        System.out.println(++m);  // value c is also incremented as d 

    }
}
