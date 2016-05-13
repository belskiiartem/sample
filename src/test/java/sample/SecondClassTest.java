package sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SecondClassTest {

	SecondClass second = new SecondClass();

	@Test
	public void testEchoSomething() {
			assertEquals("sss", second.EchoSomething());	
	};

}
