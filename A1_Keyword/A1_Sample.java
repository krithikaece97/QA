package A1_Keyword;

import org.testng.annotations.Test;

//1.  static keyword should not use in testNg. If u use also not a problem, but advice is not to use
//2.  without using the mainmethod, we are using testNg annotation here
//3.  if we type @Test annotation it ill show error... if we mouseout that it ill show like add testNg library.. this is one way o add testNg library
//4.  then we have to import the testNg annotation
//5.  if we run this program it ill show Testng Test to execute the program
//6.  output in the form of  like pass, failed 
//7.  after executing the program, refresh the program---> left we have to seen new folder called test-output---> under that folder
//we have to select index.html file, it ill directly go in to a browser window and report will be generated, another way if right click
//the index.html file--> click properties--> then copy the location and paste in browser we ill get report
public class A1_Sample {
	
	
	@Test
	public void add() {
		System.out.println("add");
	}

	

	

}
