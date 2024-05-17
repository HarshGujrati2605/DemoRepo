package com.javatest;

public class CountCapitalAlphabet {
	  
	  
	  public static int countCapitalLetters(String name) {
	        int count = 0;
	        for (int i = 0; i < name.length(); i++) {
	            char chofstring = name.charAt(i);
	            if (Character.isUpperCase(chofstring)) {
	                count++;
	            }
	        }
	        return count;
	    }
	  

	public static void main(String[] args) {
		
	  
		int countofcapitalletters = countCapitalLetters("GopiKiranHarsh");
		System.out.println("The given string has "+countofcapitalletters+" capital letters");
	

	}

}
