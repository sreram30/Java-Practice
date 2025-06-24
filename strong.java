import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(strong(num)){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }


    }
    static int fact(int n){
        int pro=1;
        for(int i=1;i<=n;i++)
            pro=pro*i;

        return pro;
    }
    static boolean strong(int num){
        int sum=0,digit;
        boolean flag = false;
        int temp=num;
        while(temp>0){
            digit=temp%10;
            sum=sum+fact(digit);
            temp=temp/10;

        }
        if(sum==num){
            flag=true;
        }
        else{
             flag=false;
        }
        return flag;


    }
}
