import java.util.Scanner;

public class harsad {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=0;
        int temp=n;
        while(temp!=0){
            int r=temp%10;
            result=result+r;
            temp=temp/10;
        }
        if(n%result==0){
            System.out.println("harshad num");
        }
        else{
            System.out.println("not a harshad num");
        }

    }
}
