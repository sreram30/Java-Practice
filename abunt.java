import java.util.Scanner;

public class abunt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0) {
                sum = sum + i;
            }

        }
        if(sum>n){
            System.out.println("ambuant number");
        }
        else{
            System.out.println("not a ambuant number");
        }
    }
}
