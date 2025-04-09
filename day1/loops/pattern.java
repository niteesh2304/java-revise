import java.util.Scanner;
//n=3
//***
//***
//***

public class pattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++){		//i --> outer --column
			for(int j = 1;j<=n;j++){	//j --> inner --row
				System.out.print("* ");
				}
			System.out.println("");
			}
		
				
		}
	}