package practice;

public class ArrayMax {
    public static void main(Str[] args) {
        int[] arr={11,12,13,14};
        int max=maxFound(arr);
        System.out.println (max);
    }
    public static int maxFound(int[] arr){
        int max= arr[0];
        for (int i=0;i<arr.length;i++){
           //max=arr[i]>max?arr[i]:max;
            // max=Math.max ( arr[i],max );
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
