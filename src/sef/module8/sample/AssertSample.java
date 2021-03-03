package sample;

import org.junit.Assert;
import org.junit.Test;

// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
public class AssertSample {

	@Test
	public static void test()
	{
		//1 - Type assert 5 %2 and 6%2 in separate statements
		Assert.assertEquals(1,5%2);
		Assert.assertEquals(0,6%2);
	}
	public static void main(String arg[]){
		//2 - Call test()
		test();
	}
}
