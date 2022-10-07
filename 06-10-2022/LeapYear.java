/*program: WAP to check for leap year and take input from user 
@author: Shushank Panchal
Date: 6th oct 2022
*/
package LabSession;
import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year :");
int year = sc.nextInt();
//if-else condition to check whether the year is a leap year or not
if((year % 4==0)&&(year %100 ==0))
{
System.out.println(year + " is a leap year :");
}
else
System.out.println(year +" is not a leap year :");
sc.close();
}
}
