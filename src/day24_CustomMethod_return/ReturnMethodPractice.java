package day24_CustomMethod_return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

       int maxNumber = max(100,200);

        System.out.println(maxNumber);

        int multiplication = maxNumber * 2;
        System.out.println("multiplication = " + multiplication);

    }

    public static int max(int a, int b){

        int result =a;
        if (a > b){
            result =a;
        }else {
            result =b;
        }
        return result;
    }

}
