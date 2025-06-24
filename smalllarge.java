import java.util.Scanner;

public class smalllarge {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number of element in array: ");
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the element in array: "+i+" ");
            ar[i]=s.nextInt();
        }
        int temp=ar[0];
        for(int i=0;i<n;i++){
            if(temp>ar[i])
                temp=ar[i];
        }
        System.out.println("The Smallest Element Is:"+temp);
        int temp1=ar[0];
        for(int i=0;i<n;i++){
            if(temp1<ar[i])
                temp1=ar[i];
        }
        System.out.println("The Largest Element Is:"+temp1);
    }
}
