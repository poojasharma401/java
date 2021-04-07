import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		int a = sc.nextInt();
		
		System.out.println("enter value of n");
		int n = sc.nextInt();
			
			
			int result = 1 ;
			
			for(int i=0;i<n;i++){
			    result= result*a;
			}
			
			System.out.println(result);
			
		
		
	}
}
