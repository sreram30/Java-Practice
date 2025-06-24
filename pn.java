import java.util.Scanner;
public class pn{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int a=s.nextInt();
		if(a>0){
			System.out.println("Positive");
		}
		else if(a<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
			
	}
}