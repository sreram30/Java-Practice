import java.util.Scanner;
public class rightt {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for (int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=i;j<=a;j++){
				System.out.print("*");
			}	
		System.out.println();
		}
	}
}