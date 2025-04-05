import java.util.Scanner;
//power of the digits

public class power{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int pow = sc.nextInt();
		int base = sc.nextInt();
		int expo = 0;
		for(int i = 0; i<=pow;i++){
			expo = base*pow;
			}
		System.out.println(base+"^"+pow+"="+expo);
		}
	}


