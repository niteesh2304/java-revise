import java.util.Scanner;
//prime
public class prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=2;i<=n;i++){
			if(n%i==0){
				count = count + 1;}
			}
		if(count==1){
			System.out.println("It's a prime number");
			}else{
			System.out.println("It's is not a prime number");}}
}
        