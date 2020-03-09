package com.epam.design_pattern;

import java.io.*;
import java.util.Scanner;
import java.util.Iterator;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	
    	
    	//Factory Method Pattern(Creational Pattern)
    	
    	
    	animal obj=new animal();
        animal_factory animal1=obj.getanimal_factory("fish");
        System.out.println(animal1.getAnimal());
        System.out.println("\n\n");
        
        
        //Prototype Pattern(Creational Pattern)
        
        
        Prototype_design p1=new Prototype_design("maruti",2,"black");
        p1.showrecord();
        System.out.println("-----------------------");
        Prototype_design p2=(Prototype_design)p1.getclone();
        p2.showrecord();
        System.out.println("\n\n");
        
        //(structural pattern)decorater pattern
        
        
        
        
        summerwear s1=new summerwear();
        System.out.println("for summer topwear is:"+s1.topwear()+"\nfor summer bottom wear is:"+s1.bottomwear());
        System.out.println("-----------------------------");
        winterwear w1=new winterwear();
        System.out.println("for winter topwear is:"+w1.topwear()+"\nfor winter bottom wear is:"+w1.bottomwear());
        System.out.println("--------------------------------\n");
        
        
        //(structural pattern)facade pattern
        System.out.println("enter 1 to query for online rate,2 for offline\n");
        int choice=sc.nextInt();
        System.out.println("enter number of iphone:");
        int num=sc.nextInt();
        shop sh1=new shop(choice,num);
        if(sh1.check==0)
        {
        	sh1.packaging();
        	sh1.delivery();
        }
        System.out.println("------------------------------------------\n\n");
        
        
        
        
        //(behavioral pattern)command pattern
        
        
        order Order=new order();
        waiter wait1=new waiter(Order);
        wait1.execute();
        customer c1=new customer(Order);
        c1.execute();
        
        //(behavioral pattern)iterator pattern
        System.out.println("---------------------------------------\n\n");
        array_of_id names=new array_of_id();
        Iterator<Object>i=names.getiterator();
        while(i.hasNext())
        {
        	String name=(String) i.next();
        	System.out.println("Name:"+name);
        }
    }
}
