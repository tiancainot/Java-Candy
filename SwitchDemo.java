package practice;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(Str[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("开始");
        int i=sc.nextInt();
        switch (i){
            /*case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;*/
            case 1://无break，case穿透
            case 2:
            case 12:
                System.out.println ( "冬季" );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入错误值");
                break;
        }
    }
}
