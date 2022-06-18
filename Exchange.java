package practice;

public class Exchange {
    public static void main(Str[] args) {
        int[] arr={1,2,3,4,5};
        for (int start=0,end=arr.length-1;start<=end;start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        exchange ( arr );
    }
    public static void exchange(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println ( arr[i] );
        }
    }
}
