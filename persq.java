import java.util.Scanner;

public class persq {
    static boolean sq(int n){
        if(n>=0){
            int sr=(int)Math.sqrt(n);
            return ((sr*sr)==n);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(sq(num)){
            System.out.println("Perfect Square Number");
        }
        else {
            System.out.println("Not Perfect Square Number");
        }

    }
}
