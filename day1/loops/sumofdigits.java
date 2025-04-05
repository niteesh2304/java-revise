import java.util.Scanner;
//Write a Java program to calculate sum of digits of a number. 

public class sumofdigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int total = 0;
		while(n!=0){
			sum = n%10;
			total = total + sum;
			n/=10;
			}
		System.out.println(total);
		}
	}