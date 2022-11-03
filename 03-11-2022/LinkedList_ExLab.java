/*
 * 2)Write a java program to check if a particular element exist in a Linked List
 * @Author-Shushank_Panchal
 * Date-03-11-2022
 */
package LabSession;
import java.util.LinkedList;
class LinkedList_ExLab 
{
public static void main(String[] args)
{
//creating object of linked list
LinkedList<Integer> a = new LinkedList<>();
//adding Elements in linkedlist
a.add(5);
a.add(6);
a.add(7);
/*
 * To check if a particular element exists in a LinkedList, use
 * boolean contains(Object obj) method.
 *
 * This method returns true if LinkedList contains a particular element,
 * false otherwise.
 */
boolean blnElement =a.contains(4);
if(blnElement)
{
  System.out.println("LinkedList contains 4");
}
else
{
  System.out.println("LinkedList does not contain 4");
}
}
}
