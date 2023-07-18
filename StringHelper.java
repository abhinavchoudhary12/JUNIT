package com.in28minutes.junit.helper;

public class StringHelper {

	public Boolean palandrome(String str) {
		
		
		if(str.length()==0)
			return false;
		str=str.toLowerCase();
		String tempString="";
		
		for(int i=0;i<str.length();i++) {
			tempString+=str.charAt(str.length()-i-1);
		}
		
		return str.equalsIgnoreCase(tempString);
		
	}

}
