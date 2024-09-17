public class arrays_26 {
    public static void main(String[] args) {
        int [] marks = new int[3];
       marks[0]=62;
       marks[1]=45;
       marks[2]=85;
       int av = (marks[0]+marks[1]+marks[2])/3;

       int [] ran = {12,4,5,63,48};
//       ran[2]=99;
        System.out.println(ran[2]);

        System.out.println(marks[2]);
        System.out.println(av);

        // a way to pprint all values of array
        for (int value : ran) {
            System.out.print(value);
            System.out.print(" ");
        }
    }
}
