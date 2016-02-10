package com.training;

public class PerfectNumber {

	public boolean isPerfect(int number) 
	{
		int temp = 0;
	    for(int i=1;i<=number/2;i++){
	    	if(number%i == 0)
	    		temp += i;
	            
	    }
	    if(temp == number){
	        return true;
	    }
	    else {
	    	return false;
	    }
	}
}
