import  java.util.Arrays;
public class exer_6_29Q3 {
    public static void main(String[] args) {
        // add 2 2d matrix array

        int [][] arr1 ={ {4,5,6} , {7,8,9}};
        int [][] arr2 ={ {14,15,16} , {17,18,19}};
        int [][] res = {{0,0,0},{0,0,0}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.println("hey");
                res[i][j] = arr1[i][j]+arr2[i][j];

            }
            System.out.println("");
        }
        for( int []i:res){
            System.out.println(Arrays.toString( i));
        }
    }
}
