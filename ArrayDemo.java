package practice;

public class ArrayDemo {
    public static void main(Str[] args) {
        int[] arr={11,22,33,44,55};
        arrDemo ( arr );
        /*arr[0]=100;
        arr[1]=200;
        System.out.println (arr);//数组内存地址
        System.out.println (arr[0]);
        System.out.println (arr[1]);
        int[] arr1=arr;
        System.out.println (arr1);//数组内存地址
        System.out.println (arr1[0]);
        System.out.println (arr1[1]);*/
    }
    public static void arrDemo(int[] arr) {
        System.out.print ("[");
        for (int i = 0; i < arr.length; i++)
            if (i==arr.length-1){
                System.out.println (arr[i]+"]");
            }else {
                System.out.print ( arr[i]+", " );
            }
    }
}
