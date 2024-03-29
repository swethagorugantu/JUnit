package Application;

import org.junit.runner.JUnitCore;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import UnitTests.JUnitMathProvider;

public class TestRunner {
	
	public static void main (String args[]) {
	
	MathProvider provider = new MathProvider();
	int res= provider.Add(10,20);
	System.out.println(res);
	
	//This result object has many methods and it is very useful
			//Type result and press dot, all the methods will display
			//This statement is to load all type of results in the result object
			Result result = JUnitCore.runClasses(JUnitMathProvider.class);
			//Here it is getting the run count from the result object
			System.out.println("Total number of tests " + result.getRunCount());
			//This is to get the failure count from the result object
			System.out.println("Total number of tests failed " + result.getFailureCount());
	 
			for(Failure failure : result.getFailures())
			{	
				//This will print message only in case of failure
				System.out.println(failure.getMessage());
			}
			//This will print the overall test result in boolean type
			System.out.println(result.wasSuccessful());
	 
		}
	
	
	
	}
