
//// Write a Java program to find maximum between two numbers.

import java.util.Scanner;

public class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a<b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}