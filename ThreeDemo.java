package practice;

import java.util.Scanner;//idea自动导包
public class ThreeDemo {
    public static void main(Str[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个人身高");
        int i=sc.nextInt();
        System.out.println("请输入第二个人身高");
        int j=sc.nextInt();
        System.out.println("请输入第三个人身高");
        int k=sc.nextInt();
        /*
        int i=150;
        int j=210;
        int k=165;
        */
        int a=i>j?i:j;
        int b=a>k?a:k;

        System.out.println("三个人中最高是:"+b+"cm");

    }
}
