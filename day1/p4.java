import java.util.Scanner;
// Write a Java program to input marks of five subjects Physics, Chemistry,
// Biology, Mathematics and Computer. Calculate percentage and grade according to following: 
// Percentage >= 90% : Grade A Percentage >= 80% : Grade B Percentage >= 70% : Grade C Percentage >= 60% : Grade D 
// Percentage >= 40% : Grade E Percentage < 40% : Grade F

public class p4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int cs = sc.nextInt();
        
        int t = (p+c+b+m+cs)/5;
        System.out.println(t);
	if(t>=90){
		System.out.println("A");
	}else if(t<90&&t>=80){
		System.out.println("B");
	}else if(t<80 && t>=70){
		System.out.println("c");
	}else if(t<70 && t>=60){
		System.out.println("D");
	}else if(t<60 && t>=40){
		System.out.println("E");
	}else{
		System.out.println("F");}
    }
}