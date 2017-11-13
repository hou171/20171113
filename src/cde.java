import java.util.Scanner;

public class cde {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Integer i,sum=0;

        i=0;
        while (sum<=500){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
        System.out.println(i);
    }
}
