package com.epam.design_pattern;

public class waiter implements actionperform {
	private order o1;
	waiter(order o1)
	{
		this.o1=o1;
	}

	public void execute(){
		o1.give();
		System.out.println("Order taken successfully\n");
	}
}
