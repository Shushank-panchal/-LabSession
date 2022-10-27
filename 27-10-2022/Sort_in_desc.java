/*
 * WAP to sort String Array in Descending order.
@Author-Shushank_Panchal
Date - 27-10-2022
 */
package LabSession;
import java.util.Scanner;
class Sort_in_desc 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//Array size
System.out.println("Enter the String Elements");
String alpha = sc.nextLine();
//array Elements 
System.out.println("Sort in Descending Order");
char arr[] = alpha.toCharArray();
System.out.println("Reverse of a string");
int i = arr.length;
for(int j=i;j>0;j--)
{
System.out.println(arr[j-1]);
}
sc.close();
}
}