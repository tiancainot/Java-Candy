package practice;

import java.util.Scanner;

public class Score {
    public static void main(Str[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner ( System.in );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt ();
        }
        int max = max ( arr );
        int min = min ( arr );
        int sum =sum ( arr );
        System.out.println ("平均成绩为"+(sum-max-min)/4);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        return max;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < min) {
                min = arr[k];
            }
        }
        return min;
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum+=arr[a];
        }
        return sum;
    }
}
