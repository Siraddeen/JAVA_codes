public class multi_Dimentional_Arr_28 {
    public static void main(String[] args) {
        //array of array is 2d array


        int [][] flate =new  int [2][3];

        flate[0][0] = 10;
        flate[0][1] = 11;
        flate[0][2] = 12;
        flate[1][0] = 20;
        flate[1][1] = 21;
        flate[1][2] = 22;


        // looping from for each method
    for(int[] i:flate){
        for(int  a:i){
            System.out.print(a + " ");
        }
        System.out.println();
    }
        System.out.println("sssssssssssssssssssssssssssssssssssss");
        // regular way
        for(int i=0;i<flate.length;i++){
            for(int j =0;j<flate[i].length;j++){
                System.out.print(flate[i][j] +" ");
            }
            System.out.println();
        }
    }
}
