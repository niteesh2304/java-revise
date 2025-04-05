import java.util.Scanner;

public class revnum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int temp = n;
		int last = 0;
		int rev = 0;
		while(temp!=0){
			temp/=10;
			count++;
			}
		while(n!=0){
			last = n%10; 
			rev = rev*10+last;
			n /=10;
			} 
		System.out.print(rev);
		}
	}