/*program: WAP to find the Reverse of a Number 
@author: Shushank Panchal
Date: 6th oct 2022
*/
package LabSession;
import java.util.Scanner;
class ReverseNumber {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int reverse = 0;
System.out.println("Enter the number : ");
int number = sc.nextInt();
//while loop to execute the statement
while(number!=0)
{
//check remainder by dividing the number with 10
int remainder = number%10;
//reversing a number by mul with 10,add remainder
reverse = reverse *10+remainder;
number = number/10;
}
System.out.println("The reverse of a given number is : "+reverse);
sc.close();
}
}
