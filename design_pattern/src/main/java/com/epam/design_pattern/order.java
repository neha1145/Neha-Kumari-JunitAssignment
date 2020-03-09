package com.epam.design_pattern;
import java.util.Scanner;
public class order {
		Scanner sc=new Scanner(System.in);
		public void complete() {
			System.out.println("Order delivered\n");
		}
		public void give() {
			System.out.println("meal?\n");
			String order_meal=sc.nextLine();
			System.out.println("Order given:"+order_meal);
		}
}
