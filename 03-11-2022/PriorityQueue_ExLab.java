/*
 * 3)Write a java program to change PriorityQueue to maximum Priorityqueue Using Any loop.
 *  @Author-Shushank_Panchal
 * Date-03-11-2022
 */
package LabSession;
import java.util.Collections;
import java.util.PriorityQueue;
class PriorityQueue_ExLab
{
public static void main(String[] args)
{
//creating object of priority Queue
PriorityQueue<Integer> obj = new PriorityQueue<Integer>(5, Collections.reverseOrder());
//adding Elements in Queue
obj.add(100);
obj.add(200);
obj.add(300);
obj.add(400);
obj.add(500);
System.out.println("\nOriginal Priority Queue: "+obj);
//setting priority to maximum using while loop
System.out.print("\nMaximum Priority Queue: ");
Integer num = null;
while( (num = obj.poll())!= null)
{
System.out.print(num+"  ");
}
System.out.print("\n");
}
}
