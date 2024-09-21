public class exer_6_29Q2 {
    public static void main(String[] args) {
        // find out if a number present in a array or not

        int [] rand = {45,12,56,37,46};
        int number = 458;
        boolean isPresent = false;

        for(int i:rand){
            if(number ==i){
                isPresent=true;
                break;
            }
        }
        if(isPresent){
            System.out.println("The given " + number+ " is in array");
        }else {
            System.out.println("The given " + number+ " is not in array");
        }

    }
}
