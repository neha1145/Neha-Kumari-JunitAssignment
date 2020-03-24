package com.epam.junit_assignment;

public class RemoveFirst2AA {

	public String remove(String string) {
		String result=string;
		if(string=="A")
			result="";
		if(string.length()>1){
		if(string.charAt(0)=='A' && string.charAt(1)!='A') 
			result=string.substring(1,string.length());
		if(string.charAt(0)=='A' &&  string.charAt(1)=='A')
			result=string.substring(2,string.length());
		if(string.charAt(0)!='A' &&  string.charAt(1)=='A')
			result=string.charAt(0)+string.substring(2,string.length());
		}
		return result;
	}
}
