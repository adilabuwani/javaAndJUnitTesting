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
not, please ask on Piazza.) Class MyCustomString should be in the same package as the
interface and should also be saved under <dir>/src/edu/qc/seclass .

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
7. Submit your solution by
○ Pushing <dir> and all the files and directories underneath it (except for the files
excluded by .gitignore, if you have one, such as all class files) to the individual remote
GitHub repository we assigned to you. You can decide whether to commit Eclipse or
IDEA’s project related files, as this does not make a difference for us, but the repo
must necessarily contain the two files:
■ Assignment3/src/edu/qc/seclass/MyCustomString.java
■ Assignment3/test/edu/qc/seclass/MyCustomStringTest.java
○ Submitting the commit ID for your submission on Blackboard. You can get your commit
ID by running " git log -1 ".
