package practice;
//字符串拼接
public class StringMontage {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        String a=arrayToString ( arr );
        System.out.println (a);
    }
    public static String arrayToString(int arr[]){
        StringBuilder sb=new StringBuilder ();
        sb.append ( "[" );
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                sb.append ( arr[i] );
            }else {
                sb.append ( arr[i] ).append ( "," );
            }
        }
        sb.append ( "]" );
        String s=sb.toString ();
       /* String s="";
        s+="[";
        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                s+=arr[i];
            }else {
                s+=arr[i];
                s+="，";
            }
        }
        s+="]";*/
     return s;
    }
}
