import java.io.*;
import java.util.*;
class VDemo
{
    public static void main(String args[])
    {
        int n=5,data;
        Scanner in = new Scanner(System.in); 
        Vector<Integer> v=new Vector<Integer>(n); 
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter Element: "); 
            data = in.nextInt();
            v.add(data);
        }
        
        System.out.println("\nDisplay whole vector = " + v); 
        System.out.println("At Capacity = "+ v.capacity()); 
        System.out.println("Size = " + v.size());
        v.remove(3); 
        System.out.println("After Deleting element = " + v); 
        System.out.print("Taking individual element = "); 
        for(int i=0;i<v.size();i++) 
        System.out.print(v.get(i)+" ");
        v.add(10);
        System.out.println("\nAfter Adding Element = " + v + " "); 
        System.out.println("First Element = "+ v.firstElement()); 
        System.out.println("Last Element = " + v.lastElement());
    }
}
 

 
