import java.util.Scanner;

public class ams {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		System.out.println("enter the num:"); 
        int n=s.nextInt();
        System.out.println("Amstrong"+amst(n));

    }
    static boolean amst(int a){
        int temp=a;
        int count=0;
        int sum=0;  
        while(a>0){
            temp=temp/10;
            count++;
        }
        System.out.println("digits:"+count);
        temp=a;
        while(a>0){
            int last = temp %10;
            sum=(int)(sum+Math.pow(last,count));
            temp=temp/10;
        }
        if(sum==a){
            return true;  
        }
        else{
            return false;
        }
    }
}	