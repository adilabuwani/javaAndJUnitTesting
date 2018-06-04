package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before           //before each test
    public void setUp() {
        mycustomstring =  new MyCustomString();
    }

    @After            //after each test
    public void tearDown() {
        mycustomstring = null;
    }
    
    @Test      //This test checks whether method countNumbers counts digits when they are between strings 
    public void testCountNumbers1() {             
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }
    
   @Test       //This test checks whether method countNumbers counts digits when they hold in separate position 
    public void testCountNumbers2() {
	   mycustomstring.setString("My numbers are 11 and 96");
	   assertEquals(2, mycustomstring.countNumbers());
    }
   
    @Test      //This test checks whether method countNumbers counts digits when they are between strings
    public void testCountNumbers3() {    	
    	mycustomstring.setString("hey there is 345 age ate");
 	   assertEquals(1, mycustomstring.countNumbers());
    }
    
    
    @Test      //This test checks whether method countNumbers counts digits=0 when string is empty
    public void testCountNumbers4() {
    	mycustomstring.setString("");
    	assertEquals(0, mycustomstring.countNumbers() );
    	
    }

    @Test      //This test checks whether method countNumbers counts digits when the number are at the begining
    public void testCountNumbers5() {
    	mycustomstring.setString("255 456 hey there is age ate");
  	   assertEquals(2, mycustomstring.countNumbers());
     
    }

    @Test     //This test checks whether method countNumbers counts digits when string is at the end
    public void testCountNumbers6() {
    	mycustomstring.setString("hey there is age ate 786");
   	   assertEquals(1, mycustomstring.countNumbers());
       
    }
    
    @Test     //This test checks whether method countNumbers counts digits when there is no digit in string
    public void testCountNumbers7() {
    	mycustomstring.setString("hey there is no digit");
   	   assertEquals(0, mycustomstring.countNumbers());
       
    }
     //test for exception
    @Test (expected = NullPointerException.class)  //This test checks whether method countNumbers throws NullPointerException if String is null
    public void testCountNumbers8() {
       
    	mycustomstring.setString(null);  //set string to null
    	mycustomstring.countNumbers();    //nullpointerException
    
    }
  
    @Test     //This test checks whether method GetEveryNthCharacterFromBeginningOrEnd Returns a string  of the characters in positions n, 2n, 3n..from Begining n=3
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }
    
    @Test  //this test is incorrect--checkOut //This test checks whether method GetEveryNthCharacterFromBeginningOrEnd Returns a string  of the characters in positions n, 2n, 3n..from End
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?"); //reverse and index three
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }
    
    @Test  //This test checks whether method GetEveryNthCharacterFromBeginningOrEnd returns empty string when string is empty
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
        
    }

    @Test //This test checks whether method GetEveryNthCharacterFromBeginningOrEnd returns emptyString when length is less then n
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString("hi");  //strLength=2
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }
    
    //test exceptions
    @Test (expected=IllegalArgumentException.class)   // This test checks whether method GetEveryNthCharacterFromBeginningOrEnd throws IllegalArgumentException If "n" less than or equal to zero startFromEnd=false
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	mycustomstring.setString("hi");  //strLength=2
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
    }

    @Test  (expected=NullPointerException.class)   //This test checks whether method GetEveryNthCharacterFromBeginningOrEnd throws NullPointerException when string is null and n is greater then 0 startFromEnd=false
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString(null);  //string is null
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false);  //n is greater then 0 
       
    }

    @Test  (expected=NullPointerException.class)   //This test checks whether method GetEveryNthCharacterFromBeginningOrEnd throws NullPointerException when string is null and n is greater then 0, startFromEnd=true
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString(null);  //string is null
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true);  //n is greater then 0 :D
    	
    }

    @Test (expected=IllegalArgumentException.class)  //// This test checks whether method GetEveryNthCharacterFromBeginningOrEnd throws IllegalArgumentException If "n" less than or equal to zero startFromEnd=true
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString("hi");  //strLength=2
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    	
    }

    @Test   //This test checks whether method GetEveryNthCharacterFromBegining returns a string of characters of position n=1 and startFromEnd=false
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("My name is adil");  
   	 assertEquals("My name is adil", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    @Test  //This test checks whether method GetEveryNthCharacterFromBegining returns a string of characters of position n=1 and startFromEnd=true
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	mycustomstring.setString("My name is adil");  
      	 assertEquals("My name is adil", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    @Test //This test checks whether method GetEveryNthCharacterFromBegining returns a string of characters of position n=5 and startFromEnd=false 
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString("My name is adil");  
      	 assertEquals("asl", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }

    @Test  //This test checks whether method GetEveryNthCharacterFromBegining returns a string of characters of position n=4 and startFromEnd=false 
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString("My name is Adil, I am from India!");  
   	 assertEquals("n A,arIa", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
   
    }

    @Test //This test checks whether method GetEveryNthCharacterFromBegining returns a string of characters of position n=4 and startFromEnd=true
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString("My name is adil");  
      	 assertEquals("n a", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, true));
        
    }

    @Test (expected=IllegalArgumentException.class) //throws IllegalArgumentException If "n" less then zero
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString("Finally done with 14 tests :)");  
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-2, false);
    	
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {  //this method checks whether method testConvertDigitsToNamesInSubstring returns right convert digit to name in string when startIndex and endIndex are between 
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }
    
    //exceptions //this method checks whether method testConvertDigitsToNamesInSubstring throws NullPointerException when startPosition" <= "endPosition", "startPosition" and  "endPosition" are greater than 0, and the current string is null
    @Test (expected=NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring2() {
    	mycustomstring.setString(null);
    	mycustomstring.convertDigitsToNamesInSubstring(3, 4);
    }

    @Test(expected=MyIndexOutOfBoundsException.class) //this method checks whether method testConvertDigitsToNamesInSubstring throws MyIndexOutOfBounds exception when startPosition" <= "endPosition", but either "startPosition" or "endPosition" are out of bounds.
    public void testConvertDigitsToNamesInSubstring3() {
      mycustomstring.setString("This is a long testCase");
      mycustomstring.convertDigitsToNamesInSubstring(0, 3);  //startPosition is outofBounds
    }

    @Test (expected=MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring4() {  //this method checks whether method testConvertDigitsToNamesInSubstring throws MyIndexOutOfBounds end position outOfBounds 
    	mycustomstring.setString("This is a long testCase");
        mycustomstring.convertDigitsToNamesInSubstring(2, mycustomstring.getString().length()+1);  //endPosition is outofBounds
    }

    @Test(expected=IllegalArgumentException.class) // this method tests whether method testConvertDigitsToNamesInSubstring throws IllegalArgumentException when "startPosition" > "endPosition"
    public void testConvertDigitsToNamesInSubstring5() {
    	mycustomstring.setString("This is a long testCase");
    	mycustomstring.convertDigitsToNamesInSubstring(4, 3);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() { //this method checks whether method testConvertDigitsToNamesInSubstring returns right output when startPosition is the first element and endPosition is the last element(begining to end)
    	mycustomstring.setString("I was 22 years old last year and today 23");
        mycustomstring.convertDigitsToNamesInSubstring(1,41 );
        assertEquals("I was TwoTwo years old last year and today TwoThree", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {  //this method checks whether method testConvertDigitsToNamesInSubstring returns right output when startPosition and endPosition is the same element
    	mycustomstring.setString("I was 22 years old last year and today 23");
        mycustomstring.convertDigitsToNamesInSubstring(7,7 );
        assertEquals("I was Two2 years old last year and today 23", mycustomstring.getString());
    	
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() { //this method checks whether method testConvertDigitsToNamesInSubstring returns right output when startPosition and endPosition are inBetween
    	mycustomstring.setString("I was 22 years old last year and today 23");
        mycustomstring.convertDigitsToNamesInSubstring(8,40 );
        assertEquals("I was 2Two years old last year and today Two3", mycustomstring.getString());
    }
    


}
