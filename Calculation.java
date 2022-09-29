/*Create a program for calculation.read three values from the user for operation
first and second values as operands.
third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second
 */
package CoreJava;
import java.util.Scanner;
class Calculation
{
public static void main(String[] args)
{
int Results;
Scanner sc = new Scanner(System.in);
//getting input value from the user
System.out.println("Enter the first number : ");
int num1 = sc.nextInt();
System.out.println("Enter the Second Number : ");
int num2 = sc.nextInt();
System.out.println("Enter the operator:1 for +,2nd for -,3rd for *,4th for / ");
int op = sc.nextInt();
switch (op) 
//performing Addition
{
case 1 :
Results = num1+num2;
System.out.println("Addition :"+Results);
break;
//performing Subtraction
case 2 :
Results = num1-num2;
System.out.println("Sunstraction"+Results);	
break;
//performing Multiplication
case 3 :
Results = num1*num2;
System.out.println("Multiplication : "+Results);
break;
//performing Division
case 4 :
Results = num1/num2;
System.out.println("Division  : "+Results);
break;
default:
System.out.println("Invalid Operator :");
break;
}
sc.close();
}
}