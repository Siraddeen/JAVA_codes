public class exe_6_5 {
    public static void main(String[] args) {
        //reverse an array
        int [] arr1 = {2,3,4};
        for(int i =arr1.length-1;i>=0;i--){
            System.out.print(" ");
            System.out.print(arr1[i]);
        }
        System.out.println("");

        // find max element in a array
        int [] a6 = {11,45,5,33};
        int max = a6[0];
        for (int i=0;i<a6.length;i++){
            if(a6[i]>max){
              max = a6[i];
            }
        }
        System.out.println("The max value in array is "+max);

        // find min element in a array
        int [] a7 = {11,45,5,33};
        int min = a7[0];
        for (int i=0;i<a7.length;i++){
            if(a7[i]<min){
              min = a7[i];
            }
        }
        System.out.println("The min value in array is "+min);

        // find if array is sorted or not
        int [] sort = {45,121,156};
        boolean isSort=true;
        for(int i=0;i<sort.length-1;i++){
            if(sort[i]>sort[i+1]){
                isSort=false;
                break;
            }
        }
        if(isSort){
            System.out.println("sorted array");
        }else {
            System.out.println("not sorted array");
        }
    }
}
