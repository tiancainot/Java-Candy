package practice;

public class FlowerDemo {
    public static void main(Str[] args){
        int count=0;
        System.out.println ("水仙花数分别为：");
        for (int i=100;i<=999;i++){
            int a=i%10;//个位
            int c=(i/10)%10;//十位
            int b=i/100;//百位
            if(a*a*a+b*b*b+c*c*c==i) {
                count++;
                System.out.println ( i );//注意输出位置，在循环内
            }
        }
        System.out.println ("水仙花数共有"+count+"个");
    }
}
