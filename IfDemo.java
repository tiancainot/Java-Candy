package practice;

import java.util.Scanner;

public class IfDemo {
    public static void main(Str[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字");
        int i=sc.nextInt();
        if (i%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}
