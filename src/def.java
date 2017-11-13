import java.util.Scanner;

public class def {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Integer i,sum=0,num;
        double avg;

        i=1;
        System.out.println("請輸入第"+i+"個數字");
        num=sc.nextInt();

        while (num != 99999){
            sum=sum+num;
            i++;
            System.out.println("請輸入第"+i+"個數字");
            num=sc.nextInt();
        }
        avg=sum/(i-1);
        System.out.println(sum);
        System.out.println(avg);
    }
}
