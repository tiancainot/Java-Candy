package practice;

import java.util.Random;
import java.util.Scanner;

public class GuessRandom {
    public static void main(Str[] args){
        Random r=new Random ();
        int x= r.nextInt (100)+1;
        System.out.println ("随机生成的数字为："+x);
        while (true){
        System.out.println ("请输入数字：");
        Scanner s=new Scanner(System.in);
        int y= s.nextInt ();
            if (y > x) {
                System.out.println ( y + ">" + x );
            } else if (y < x) {
                System.out.println ( y + "<" + x );
            }else {
                System.out.println ("你猜对了");
                break;
            }
        }
    }
}
