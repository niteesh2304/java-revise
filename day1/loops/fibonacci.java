import java.util.Scanner;

public class fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t1 = 0;
		int t2 = 1;
		int t3 =0;
		t3 = t1+t2;
		System.out.printf("%d %d ",t1 ,t2 );
		for(int i =0;i<=n-3;i++){
			System.out.print(t3+" ");
			t1 = t2;
			t2 = t3;
			t3 = t1 + t2;
			
			}	
		}
	}