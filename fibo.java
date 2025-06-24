import java.util.Scanner;

public class fibo
{
    public static void main (String[]args)
    {
        Scanner s=new Scanner(System.in);

        int num =s.nextInt();
        int a = 0, b = 1;


        System.out.print (a + " , " + b );
        int nextTerm;
        for (int i = 2; i < num; i++)
        {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print (" , "+nextTerm );
        }


    }
}
