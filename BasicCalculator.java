/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("two numbers");
		double x =sc.nextInt();
		double y =sc.nextInt();
		System.out.println("+,-,*,/");
		char operator=sc.next().charAt(0);
		switch(operator){
		    case '+':
		        System.out.println(x+y);
		  case '-':
		      System.out.println(x-y);
		      case '*':
		          System.out.println(x*y);
		  case '/':
		      if(y==0){
		          System.out.println("error");
		      }
		      else{System.out.println(x/y);}
		          
		      
		       
		}
	}
}
