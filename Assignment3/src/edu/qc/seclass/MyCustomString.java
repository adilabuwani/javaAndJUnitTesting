package edu.qc.seclass;


public class MyCustomString implements MyCustomStringInterface {
	
	 String input=null;  //string by default null
	
	//accessor  
	 public String getString() {            
		 
		 return this.input;               //return input string
	 }
	 
	 //mutator
	 public void setString(String string) {
		 this.input=string;              //Sets the value of the current string.
	 }
	 
	public int countNumbers() {
		
		if(this.input.isEmpty()) {   //if string empty return 0
			return 0;
		}
		
		if(this.input==null) {       //if string is null throw exception
			throw new NullPointerException("NullPointerException: the current string is null");
		}
		
		int countDigit=0;
		for(int i=0;i<this.input.length();i++) {
			
			char temp=this.input.charAt(i);
			
			if(!Character.isDigit(temp)) {        //not a digit? continue
				continue;
			} else if(i==this.input.length()-1) {   //digit at the last index? increment 
				countDigit++;
			}else if(Character.isDigit(this.input.charAt(i+1))) {
				continue;                           //next element also a digit? continue(no-increment)
			}else {    //is a digit
				countDigit++;
			}
			
		}  //end for
		
		return countDigit;
		
	} //end countNumbers

	public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
		
		String result="";
		
		if(this.input.isEmpty()||this.input.length()<n) {  //empty or less then n
			return "";    //return empty string
		}
		
		if(n<=0) {
			throw new IllegalArgumentException("n is either less then zero or is 0 ");
			
		}
		
		if(n>0 && this.input==null) {
			throw new NullPointerException("NullPointerException: the current string is null and is greater than zero");
		}
		
		String tempStr="";  //temporary string
		
		if(startFromEnd==false) {  //donot flip :)
			tempStr=this.input;
		}else { //flip the tempStr as it is true ;)
			tempStr=new StringBuilder(this.input).reverse().toString();
		}
			
		int start=1;
		while((n*start)<=tempStr.length()) {
		int index=(n*start)-1;     //get actual index
		result=result+String.valueOf(tempStr.charAt(index));	
		start++;    
		} //end while
		
		if(startFromEnd==true) {  //flip the result if to start from end
		result=new StringBuilder(result).reverse().toString();
		}
		
		return result;
	}

	public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
		
		if(startPosition > endPosition) {
			throw new IllegalArgumentException("Illegal Argument: startPosition > endPosition");
		}
		
		if((startPosition <=endPosition)&& (startPosition<1|| endPosition<1 || startPosition>this.input.length()||endPosition>this.input.length())) {
			throw new MyIndexOutOfBoundsException("Index out of bounds");
		}
		
		if(startPosition<=endPosition && (startPosition>0 && endPosition>0)&& this.input==null) {
			throw new NullPointerException("NullPointerException as the string is empty");
		}
		
		
		String temp="";
		String lhs="";   //leftHandString
		String rhs="";   //rightHandString
		//the first letter is considered to be 1
		int startIndex=startPosition-1;
		int endIndex=endPosition;
		temp=input.substring(startIndex, endIndex);  //temp holds a substring of the input
		
		lhs=input.substring(0, startIndex);
		rhs=input.substring(endIndex);
		
		//replace digits
		temp=temp.replaceAll("0", "Zero");
		temp=temp.replaceAll("1", "One");
		temp=temp.replaceAll("2", "Two");
		temp=temp.replaceAll("3", "Three");
		temp=temp.replaceAll("4", "Four");
		temp=temp.replaceAll("5", "Five");
		temp=temp.replaceAll("6", "Six");
		temp=temp.replaceAll("7", "Seven");
		temp=temp.replaceAll("8", "Eight");
		temp=temp.replaceAll("9", "Nine");
		
		setString(lhs+temp+rhs);  //set string to LeftHandSide ConvertedString RightHandSide
		
	}

}
