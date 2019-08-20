
package UnitTests;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Application.MathProvider;
//import junit.extensions.*;

public class JUnitMathProvider {
	MathProvider provider=new MathProvider();;
	 


@Test
public void add()
{
	System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	int firstNumber = 10;
	int secondNumber = 20;
	assertEquals((firstNumber + secondNumber), provider.Add(firstNumber, secondNumber));
	System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
}
}