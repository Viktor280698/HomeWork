import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int size = 4;

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }


    //exersize 1.
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }


    //exersize 2.
    public static void fillArray() {
        int [] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr [i] = i * 3;
        }
        System.out.println(Arrays.toString(arr));
    }


    //exersize 3.
    public static void changeArray() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //exersize 4.
    public static void fillDiagonal(){
        int [][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++){
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        } for (int i = 0; i < arr.length; i++){
            System.out.println();
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }  System.out.println();
    }
}