import java.util.Arrays;
import java.util.Scanner;

public class frequency {
    static void arfr(int ar[],int n){
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        for(int i=0;i<n;i++){
            if(vis[i]==true)
                continue;
                int count=1;
                for(int j=i+1;j<n;j++){
                    if(ar[i]==ar[j]){
                        vis[j]=true;
                        count++;
                    }
                }
                System.out.println(ar[i]+" occurs "+count);
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        arfr(ar,n);
    }
}
