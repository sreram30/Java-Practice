import java.util.Scanner;

public class auto {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sq=n*n;
        if(automorphic(n)==1){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("not Automorphic");
        }
    }
    static int automorphic(int n){
        int square=n*n;
        while(n!=0){
            if(n%10==square%10){
                return 1;
            }
            n=n/10;
            square=square/10;
        }
        return 0;

    }
}
