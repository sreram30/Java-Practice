import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(int i=(n-1);i>=0;i--){
            System.out.println(ar[i]);
        }
    }
}
