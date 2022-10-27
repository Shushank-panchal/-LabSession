/*
 * WAP TO SORT INT ARRAY IN DESCENDING ORDER
 * @AUTHOR-SHUSHANK_PANCHAL
 * DATE-27-10-2022
 */
package LabSession;
import java.util.Scanner;
class Sort_Int_Array 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//Take input from the user
System.out.println("Enter the Size of Array : ");
int num = sc.nextInt();
//Array Elements
int arr[] = new int[num];
System.out.println("Enter the Array Elements : ");
int temp = 0;
for(int i = 0;i<arr.length;i++)
{ arr[i] = sc.nextInt();
	System.out.println(arr[i]+" ");
}
for(int i = 0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j]) 
{
	temp = arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
}
System.out.println();
//Displaying Array Elements After Sorting
System.out.println("Elements ofArray Sorted in as Ascending Order");
for(int i = 0;i<arr.length;i++)
{
	System.out.println(arr[i]+" ");
}
}
}
