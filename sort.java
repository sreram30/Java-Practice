import java.util.Scanner;

public class sort {
    static void printOrder(int ar[],int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        printOrder(ar,n);
    }
}
