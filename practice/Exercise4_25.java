public class Exercise4_25 {
    public static void main(String[] args) {
     /*
        for(int a = 5 ;a>0;a--){
            for (int e=0;e<=a;e++){
                System.out.print('*');
            }
            System.out.println();
        }
      */
        int a = 0;
        int s = 0;
        while (a<=10){
            if(a%2==0){
                s += a;
            }

            System.out.println(a);
            a++;
        }
       System.out.println(s);
       System.out.print("factoial is: ");


        // factorial
        int gg = 1;
        int n = 6;
        int fac = 1;
        while(gg<=n){
            fac *=gg;
            gg++;
        }
        System.out.println(fac);
        int b=5;
        int w =1;
        for(int z =  1;z<=b;z++){
            w *=z;
        }
        System.out.println(w);
    }
}
