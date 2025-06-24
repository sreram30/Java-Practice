import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a NUM: ");
        double n=s.nextInt();
        double b=s.nextInt();
        double res=1;
        while(b!=0){
            res*=n;
            b--;
        }
        System.out.println(res);
    }
}
