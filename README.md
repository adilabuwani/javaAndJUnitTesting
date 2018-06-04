# java-With-JUnit #
This assignment assesses basic knowledge of Java and JUnit, which will need for future assignments and projects.

# To complete the assignment you must complete the following tasks: #

1. Clone your individual GitHub repository in your local workspace. This is the same repository
that you used for the previous assignment (i.e.,
https://github.com/qc-se-spring2018/370Spring18<firstinitiallastname>.git ).
2. Download the archive Assignment3.zip
3. Unzip the archive in the root directory of the repository, which will create a directory called
Assignment3 and several subdirectories. Hereafter, we will refer to the directory
Assignment3 in your local repo as <dir> .
4. Directory <dir>/src contains, in a suitable directory, Java interface
edu.qc.seclass.MyCustomStringInterface . It also contains exception
edu.qc.seclass.MyIndexOutOfBoundsException , which is used by the interface.

### FIRST TASK ###
5. Your first task is to develop a Java class called MyCustomString that suitably implements the
MyCustomStringInterface that we provided. (The semantics of the methods in the
interface should be obvious from their name and from the JavaDoc comments in the code. If
not,its provided hear as well.

     * Returns the current string. If the string is null, it should return null.
     * @return Current string
     */
    String getString();

    /**
     * Sets the value of the current string
     * @param string The value to be set
     */
    void setString(String string);

    /**
     * Returns the number of numbers in the current string, where a number is defined as a
     * contiguous sequence of digits.
     * If the current string is empty, the method should return 0.
     *
     * Examples:
     * - countNumbers would return 2 for string "My numbers are 11 and 96".
     *
     * @return Number of numbers in the current string
     * @throws NullPointerException If the current string is null
     */
    int countNumbers();
    /**
     * Returns a string that consists of all and only the characters in positions n, 2n, 3n, and
     * so on in the current string, starting either from the beginning or from the end of the
     * string. The characters in the resulting string should be in the same order and with the
     * same case as in the current string.
     *
     * If the current string is empty or has less than n characters, the method should return an
     * empty string.
     *
     * Examples:
     * - For n=2 and a string of one character, the method would return an empty string.
     * - For n=2 and startFromEnd=false, the method would return the 2nd, 4th, 6th, and so on
     *   characters in the string.
     * - For n=3 and startFromEnd=true, the method would return the 3rd from the last character
     *   in the string, 6th from the last character in the string, and so on (in the order in
     *   which they appear in the string).
     *
     * Values n and startFromEnd are passed as parameters. The starting character, whether it is
     * the first one or the last one in the string, is considered to be in Position 1.
     *
     * @param n Determines the positions of the characters to be returned
     * @param startFromEnd Determines whether to start counting from the end or from the
     *                     beginning when identifying the characters in position n, 2n, 3n, and so
     *                     on. Please note that the characters are always returned in the order in
     *                     which they appear in the string.
     * @return String made of characters at positions n, 2n, and so on in the current string
     * @throws IllegalArgumentException If "n" less than or equal to zero
     * @throws NullPointerException If the current string is null and "n" is greater than zero
     *
     */
    String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd);
    /**
     * Replace the individual digits in the current string, between startPosition and endPosition
     * (included), with the corresponding English names of those digits, with the first letter
     * capitalized. The first character in the string is considered to be in Position 1.
     * Unlike for the previous method, digits are converted individually, even if contiguous.
     *
     * Examples:
     * - String 460 would be converted to FourSixZero
     * - String 416 would be converted to FourOneSix
     *
     * @param startPosition Position of the first character to consider
     * @param endPosition   Position of the last character to consider
     * 
     * @throws IllegalArgumentException    If "startPosition" > "endPosition"
     * @throws MyIndexOutOfBoundsException If "startPosition" <= "endPosition", but either
     *                                     "startPosition" or "endPosition" are out of
     *                                     bounds (i.e., either less than 1 or greater than the
     *                                     length of the string)
     * @throws NullPointerException        If "startPosition" <= "endPosition", "startPosition" and
     *                                     "endPosition" are greater than 0, and the current
     *                                     string is null
     */
    void convertDigitsToNamesInSubstring(int startPosition, int endPosition);

### SECOND TASK ###
6. Your second task is to develop a set of JUnit 4.0 test cases for class MyCustomString .
○ You should create several test cases for each method that implements a method in the
interface, except for getters and setters (i.e., the first two methods). Make sure that
every test method has a suitable oracle (i.e., either an assertion or an expected
exception), that the tests are not trivial (i.e., have a specific purpose). In other words,
each test should (1) test a specific piece of functionality and (2) check that such piece
of functionality behaves as expected.
○ In addition, for each exception that can be thrown by a method M and is explicitly
mentioned in M’s documentation, there should be at least one test for M that results in
that expected exception. For example, at least three of the tests for method
convertDigitsToNamesInSubstring should result in expected exceptions:
- One for IllegalArgumentException
- One for MyIndexOutOfBoundsException
- One for NullPointerException
- When testing for an expected exception, make sure to use the @Test (expected =
<exception class> ) notation. For example:
@Test (expected = MyIndexOutOfBoundsException. class )
public void testConvertDigitsToNamesInSubstring8() {
...
}
○ To make your job a little easier, the archive also contains, in directory <dir>/test , a
test class edu.qc.seclass.MyCustomStringTest , which provides a skeleton for the
test cases that you need to implement and a complete implementation for a few of
them. Your job is to write the body of the test cases that are not implemented (i.e.,
the one that simply fail with a "Not yet implemented” message). Make also sure that
the test cases you write are not just a trivial variation of the ones we provide. To this
end, make sure to add a concise comment to each test that you implement to
clarify its rationale (e.g.,. “This test checks whether method
convertDigitsToNamesInSubstring suitably throws an IllegalArgumentException if
startPosition is greater than endPosition"). Finally, creating more than the required test
cases will not be rewarded nor penalized; in other words, feel free to write more tests
if you are so inclined, but you will have to provide at least as many tests as there are
skeletons .

