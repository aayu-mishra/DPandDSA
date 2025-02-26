package arrays2D;

public class MatrixMultiplication {
    /**
     * Implement a method to multiply two 2D arrays (matrices)
     * if their dimensions allow for multiplication. Return the resulting matrix.
     */

    public static void main(String[] args) {
        int i=3,j=2;
        int element1=0,element2=10;
        int[][] arr1= new int[i][j];


        for(int k=0;k<i;k++){
            for(int l=0;l<j;l++){
                arr1[k][l]=element1++;
                System.out.print(arr1[k][l] +" ");
            }
            System.out.println();
        }
        int x=2,y=3;
        int[][] arr2= new int[x][y];
        for(int k=0;k<x;k++){
            for(int l=0;l<y;l++){
                arr2[k][l]=element2++;
                System.out.print(arr2[k][l] +" ");
            }
            System.out.println();
        }

        mulltiplication(arr1,arr2);
    }

    public static void mulltiplication(int[][] arr1, int[][] arr2) {
        if(arr1==null||arr2==null||arr1[0].length!=arr2.length){
            throw new RuntimeException("Error");
        }
        int[][] result=new int[arr1.length][arr2[0].length];

    }
}
