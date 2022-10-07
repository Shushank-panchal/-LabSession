/*program: WAP to create Reverse Pyramid
@author: Shushank Panchal
Date: 6th oct 2022
*/
package LabSession;
import java.util.Scanner;
class CheckPassword
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the User_Name : ");
String name = sc.nextLine();
System.out.println("Enter your Password : ");
int password=sc.nextInt();	
//if condition to check if the password is correct or not
if(password==1234)
{
System.out.println(name +" Login Successful..");	
}
else
System.out.println(name +" your password is incorrect..Try Again");	
sc.close();
}
}
