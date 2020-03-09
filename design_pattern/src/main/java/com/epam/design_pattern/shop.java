package com.epam.design_pattern;

public class shop {
	private online_order on1;
	private offline_order of1;
	public static int iphone=30;
	int n;
	public static int check;
	public shop(int i,int n) {
		this.n=n;
		if(i==1 && iphone>0) {
			online_order obj=new online_order();
			System.out.println("product released from warehouse\n");
			iphone=iphone-n;
			obj.modleid();
			obj.price();
			System.out.println("number of items:"+obj.number_of_items(n));
			check=0;
		}
		if(i==2 && iphone>0)
		{
			offline_order obj=new offline_order();
			System.out.println("product released from warehouse\n");
			iphone=iphone-n;
			obj.modleid();
			obj.price();
			System.out.println("number of items:"+obj.number_of_items(n));
			check=0;
			
		}		
		if(iphone <0)
		{
			System.out.println("product is not available");
			check=1;
		}	
	}
	public void packaging() {
		System.out.println("packaging done\n");
	}
	public void delivery() {
		System.out.println("out for delivery\n");
	}
	
}
