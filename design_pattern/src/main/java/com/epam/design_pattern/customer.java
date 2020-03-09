package com.epam.design_pattern;

public class customer implements actionperform{
	private order o1;
	customer(order o1)
	{
		this.o1=o1;
	}
	public void execute() {
		o1.complete();
	}
	
	
}
