package practice;

public class FuzhiyunsuanDemo {
    public static void main(Str[] args){
        int i=10;
        i+=1;
        System.out.println("i:"+i);
        short a=10;
        a+=20;//自带强制类型转换
        a=(short)(a+20) ;
        System.out.println("a:"+a);
    }
}
