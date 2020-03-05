package com.epam.collection_assignment;


import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App 
{

    public static void main( String[] args )
    {
    	try {
    		Mycollect a = new Mycollect();
    		Scanner sc=new Scanner(System.in);
    		System.out.println("initially take first 10 inputs");
    		for(int i=0;i<10;i++)
    		{
    			a.AddElement(sc.nextLine());
    		} 
            a.display(); 
            System.out.println("Adding an element in 2nd position");
            a.AddAtPosition(2,"hello");
            a.display();
            System.out.print("Enter number of elements you want to add more");
            int n=sc.nextInt();
            for(int i=0;i<=n;i++)
            {
            	a.AddElement(sc.nextLine());
            }
            System.out.println("After adding "+n+"elements more ");
            a.display();
            System.out.println("key element is present ?");
            String key=sc.nextLine();
            System.out.println(a.iscontain(key));
            System.out.println("after removing element of position 2");
            a.removeElement(2);
            a.display();
            sc.close();
        } catch (Exception e) {  
        }  
   
    }
}
