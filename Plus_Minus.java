import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int size = arr.length;
        int zero = 0, positive = 0, negative = 0;
        for (int i = 0 ; i<size; i++){
            if(arr[i]>0){
                positive++;
            }
            else{
                if(arr[i]<0){
                    negative++;

                }
                else{
                    if(arr[i]==0){
                        zero++;
                    }
                }
            }
        }
        double result_posi = (float) positive/size;
        double result_zero = (float) zero/size;
        double result_nega = (float) negative/size;
        System.out.format("%.6f\n",result_posi);
        System.out.format("%.6f\n",result_nega);
        System.out.format("%.6f\n",result_zero);
        



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
