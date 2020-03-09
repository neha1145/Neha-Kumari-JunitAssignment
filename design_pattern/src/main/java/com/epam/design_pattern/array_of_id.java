package com.epam.design_pattern;

import java.util.Iterator;

public class array_of_id implements container{
	public String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"};   
	public Iterator getiterator() {
		return new array_of_idIterate();
	}
	private class array_of_idIterate implements Iterator{
		int i;
		public boolean hasNext() {
			if(i<name.length)
			{
				return true;
			}
			else
				return false;
		}
		public Object next() {
			if(this.hasNext())
			{
				return name[i++];
			}
			return null;
		}
	}
}
