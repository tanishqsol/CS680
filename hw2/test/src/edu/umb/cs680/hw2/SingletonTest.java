package edu.umb.cs680.hw2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw2.Singleton;



public class SingletonTest {

	@Test
	public void verifyInstanceNotNull() {
		assertNotNull(Singleton.getInstance());
	}
	
	@Test
	public void verifySameInstance() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		assertSame(s1,s2);
	}

}