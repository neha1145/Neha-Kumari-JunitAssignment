package com.epam.design_pattern;

interface prototype1{
	public prototype1 getclone();
}
class Prototype_design implements prototype1{
	private String model;
	private int number_of_wheels;
	private String color;
	public Prototype_design() {
		System.out.println("model?\tnumberof wheels?\tcolor?\n");
	}
	public Prototype_design(String model,int wheels,String color) {
		this();
		this.model=model;
		this.number_of_wheels=wheels;
		this.color=color;
	}
	public prototype1 getclone() {
		return new Prototype_design(model,number_of_wheels,color);
	}
	public void showrecord() {
		System.out.println("model:"+model+"\nnumber_of_wheels:"+number_of_wheels+"\ncolor:"+color);
	}
}
