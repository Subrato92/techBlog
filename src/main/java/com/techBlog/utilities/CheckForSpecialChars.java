package com.techBlog.utilities;

import org.springframework.stereotype.Component;

@Component
public class CheckForSpecialChars {
	
	public boolean isSafe(String ... args) {
		
		for(String s: args) {
			if( !validate(s.trim()) ) {
				return false;
			}
		}
		
		return true;
	}
	
	//TODO : To Implement validator
	private boolean validate(String aString) {		
		return true;		
	}
	
}
