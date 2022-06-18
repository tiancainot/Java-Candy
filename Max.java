package practice;

public class Max {
    public static void main(Str[] args) {
/*
        Scanner sc=new Scanner (System.in);
        sc.nextInt ();
*/
//        getMax(2,7);
        boolean flag=isEvenNumber (10);
        System.out.println (flag);

    }
//    public static void getMax(int a,int b){
//        if (a>b){
//            System.out.println (a);
//        }else{
//            System.out.println (b);
//        }
//    }
    public static boolean isEvenNumber(int number){
        if (number%2==0){
            return true;
        }else {
            return false;
        }
    }
}
