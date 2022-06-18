package practice;

import java.util.Scanner;

public class TestDemo {
    public static void main(Str[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("满分100，自己看着请输入成绩吧：");
        int i= sc.nextInt();
        if (i>0&&i<60){
            System.out.println("奖励大嘴巴子");
        }else if(i>=60&&i<90){
            System.out.println("奖励好吃滴");
        }else  if (i>=90&&i<=100){
            System.out.println("奖励大玩具");
        }else if (i<=0||i>100){
            System.out.println("孩子废了，换个号重新练吧");
        }
    }
}
