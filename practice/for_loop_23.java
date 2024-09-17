public class for_loop_23 {
    public static void main(String[] args) {
        for (int a = 1 ; a<=12;a+=2){
            System.out.println(a);
        }
        System.out.println("decrement");
        for (int f = 4;f>0;f--){
            System.out.println(f);
        }
        System.out.println("using break");

        // now we can break any loop with this technique
        for(int s = 4;s<12;s++){
            System.out.println(s);
            if (s>=8){
                break;
            }
        }
        System.out.println("loop breaked");
    }
}
