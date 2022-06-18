package practice;

import java.util.Random;

public class RandomDemo {
    public static void main(Str[] args){
        Random r=new Random ();
        for (int i=0;i<10;i++){
            int n= r.nextInt (10);
            System.out.println (n);
        }
        System.out.println ("---------");
        int x= r.nextInt (100)+1;//0到99加1后变为1到100
        System.out.println (x);
    }
}
