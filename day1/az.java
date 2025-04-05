import java.util.Scanner;
//To print from a to z

public class az{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char start = sc.nextLine().charAt(0);
		char end = sc.nextLine().charAt(0);
		
		for(char i = start;i<=end;i++){
			System.out.println(i+" ");}
		}
	}
