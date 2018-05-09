package org.itstep.service;

public class SceletonService {
	
	public String reverseText(String text) {
		
		String words[] = text.split(" ");
		String result ="";
		
		for(int i=words.length-1;i>=0;i--) {
			result+= words[i]+" ";
		}
		
		return result.trim();
	}
}
