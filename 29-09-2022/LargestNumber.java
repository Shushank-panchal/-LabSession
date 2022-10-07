package CoreJava;
import java.util.Scanner;
//program to find largest of two numbers.
class LargestNumber 
{
public static void main(String[] args)
{
//Taking Input from the User
Scanner sc = new Scanner(System.in);
//finding Largest of two numbers
System.out.println("Enter the First number : ");
int num1 = sc.nextInt();
System.out.println("Enter the Second Number : ");
int num2 = sc.nextInt();
//using Relational Operator
if (num1>num2)
{
	System.out.println("NUm1 is Greater : ");
}
else
System.out.println("Num2 is Greater : ");	
}
}
