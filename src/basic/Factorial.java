package basic;

public class Factorial {

    /**
     * n!= n*n-1*n-2....*1
     * @param args
     */
    public static void main(String[] args) {
        int n= 6;
        System.out.println(factorial(n));;
    }

    private static int factorial(int n) {
        int output=1;
        if(n==0||n==1){
            return 1;
        }
//        for(int i=n;i>1;i--){
//            if(i==n){
//                output = i*(i-1);
//            }else{
//                output =output*(i-1);
//            }
//        }

        for(int i=1;i<=n;i++){
            output= output*i;
        }
        return output;
    }
}
