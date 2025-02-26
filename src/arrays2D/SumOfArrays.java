package arrays2D;

public class SumOfArrays {
    public static void main(String[] args) {
        int i=3,j=3;
        int element1=0,element2=10;
        int[][] arr1= new int[i][j];
        int[][] arr2= new int[i][j];

        for(int k=0;k<i;k++){
            for(int l=0;l<j;l++){
                arr1[k][l]=element1++;
            }
        }

        for(int k=0;k<i;k++){
            for(int l=0;l<j;l++){
                arr2[k][l]=element2++;
            }
        }
        sumOfArrays(arr1,arr2);

    }

    public static void sumOfArrays(int[][] arr1, int[][] arr2) {
        int i=arr1.length,j=arr1[0].length;
        if(arr1.length!=arr2.length||arr1==null||arr2==null||arr1[0].length!=arr2[0].length){
            throw new RuntimeException("cannot oerform addition as arrays are not correct");
        }
        int[][] sum=new int[i][j];

        for(int k=0;k<i;k++){
            for(int l=0;l<j;l++){
                sum[k][l]= arr1[k][l] +arr2[k][l];
                System.out.print(arr1[k][l]+"+"+ arr2[k][l]+ "="+sum[k][l]+" ");
            }
            System.out.println();
        }
    }
}
