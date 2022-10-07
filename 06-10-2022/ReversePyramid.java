/*program: WAP to create Reverse Pyramid
@author: Shushank Panchal
Date: 6th oct 2022
*/
package LabSession;
import java.util.Scanner;
class ReversePyramid
{
public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);
//size of Pyramid
System.out.println("Enter the Number : ");
int number=sc.nextInt();
int i,j;
//outer loop for rows
for(i=number;i>=1;i--)
{
//inner loop for print space
for(j=i;j<number;j++)	
{
System.out.println(" ");	
}
//inner loop for print Star
for(j=1;j<=(2 * i - 1);j++)
{
System.out.print("*");
}
//ending line after each row
System.out.println("");	
}
}
}
