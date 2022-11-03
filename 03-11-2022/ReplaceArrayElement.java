/*
 * 5)Write a java program to replace the second element of a ArrayList with the specified element
 * @Author-Shushank_Panchal
 * Date-03-11-2022
 */
package LabSession;

import java.util.ArrayList;
public class ReplaceArrayElement
{
public static void main(String[] args) 
{
ArrayList<String> obj = new ArrayList<String>();  //creating array_list
{
//adding object in Arraylist
obj.add("a");
obj.add("b");
obj.add("c");
obj.add("d");
obj.add("e");
//System.out.println(obj);
System.out.println("Original array list: " + obj);
String new_val = "g";
obj.set(1,new_val);

int num=obj.size();
System.out.println("Replace second element with '23'."); 
for(int i=0;i<num;i++)
System.out.println(obj.get(i));
}
}
}
