package practice;

public class Rabbit {
    public static void main(Str[] args) {
        int[] arr=new int[21];
        arr[0]=1;
        arr[1]=1;
        for (int i=0;i<19;i++){
            arr[i+2]=arr[i]+arr[i+1];
        }
        System.out.println (arr[19]);
    }
}
