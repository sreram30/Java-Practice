import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a NUM: ");
        int n=s.nextInt();
        int pr=1;
        for(int i=1;i<=n;i++){
            pr=pr*i;
        }
        System.out.println("Factorial is "+pr);

    }
}
