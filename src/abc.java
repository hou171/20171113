import java.util.Scanner;

public class abc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Integer i;
        Integer sum=0;
        for(i=0;i<=10;i=i+2){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
