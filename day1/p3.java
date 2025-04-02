import java.util.Scanner;
//Write a Java program to check whether a number is divisible by 5 and 11 or not.

public class p3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if(a%5 ==0 && a%11==0){
            System.out.println(a);
        }else{
            System.out.println("not divisible");
        }
    }
}