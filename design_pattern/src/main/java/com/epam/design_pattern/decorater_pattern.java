package com.epam.design_pattern;

interface body{
	public String topwear();
	public String bottomwear();
}

class summerwear implements body{
	public String topwear() {
		return "Shirt";
	}
	public String bottomwear() {
		return "Skirt";
	}
}
class winterwear implements body{
	public String topwear() {
		return "jacket";
	}
	public String bottomwear() {
		return "pant";
	}
}

public abstract class decorater_pattern implements body {
	private body newbody;
	public decorater_pattern(body newbody) {
		this.newbody=newbody;
	}
	public String topwear() {
		return newbody.topwear();
	}
	public String bottomwear() {
		return newbody.bottomwear();
	}
}

