/*
 * WAP to print happy_diwali using any loop
 * @Author-shushank_panchal
 * Date-27-10-2022
 */
package LabSession;
import java.util.Scanner;
class Happy_Diwali
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Name : ");
String Your_Name = sc.nextLine();
String a[]	= new String[1];
a[0]="Happy Diwali";
for(int i=0;i<=a.length;i++) 
{
System.out.println(a[i]+" "+Your_Name);
}
sc.close();
}
}