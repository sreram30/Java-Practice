import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int target=s.nextInt();
        for(int i=0;i<n;i++){
            if(ar[i]==target){
                System.out.println("the element is found in pos: "+i);
            }
        }

    }
}
