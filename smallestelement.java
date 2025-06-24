import java.util.Scanner;

public class smallestelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of element in array:");
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element in array:"+i);
            ar[i]=s.nextInt();
        }
        int temp=ar[0];
        for(int i=0;i<n;i++){
            if(temp>ar[i])
                temp=ar[i];
        }
        System.out.println("The Smallest Element Is:"+temp);
    }

}
