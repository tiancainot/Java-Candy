package practice;

import java.util.Scanner;

public class ArrayFind {
    public static void main(Str[] args) {
        int[] arr={19,28,37,46,50};
        Scanner sc=new Scanner (System.in);
        System.out.print ("请输入数字:");
        int a=sc.nextInt ();
        int index=find ( arr,a );
        System.out.println ("对应的索引为"+index);
    }
    public static int find(int arr[],int a){
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if (a==arr[i]){
                index=i;
                break;
            }
        }
        return index;
    }
}
