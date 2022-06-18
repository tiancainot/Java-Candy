package practice;

public class Chicken {
    public static void main(Str[] args) {
        for (int x=0;x<21;x++){
            for (int y=0;y<34;y++){
                int z=100-x-y;
                if (z%3==0 && 5*x+3*y+z/3==100){
                    System.out.println (x+","+y+","+z);
                }
            }
        }
    }
}
