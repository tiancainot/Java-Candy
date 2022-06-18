package practice;

public class Return {
    public static void main(Str[] args) {
        System.out.println (getMax ( 3,5 ));
    }
    public static int getMax(int a,int b){
        int max=a>b?a:b;
        return max;
    }
}
