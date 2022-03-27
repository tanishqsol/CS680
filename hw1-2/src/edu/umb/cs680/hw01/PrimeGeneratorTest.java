package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	@Test
	public void firstTen()
	{
		PrimeGenerator gen = new PrimeGenerator(1,10);
		gen.generatePrimes();
		Long[] expectedPrimes = {2L, 3L, 5L, 7L};
		assertArrayEquals( expectedPrimes, gen.getPrimes().toArray() ); 
	}

	@Test
	public void firstThirty()
	{
		PrimeGenerator gen = new PrimeGenerator(1,30);
		gen.generatePrimes();
		Long[] expectedPrimes = {2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L};
		assertArrayEquals( expectedPrimes, gen.getPrimes().toArray() ); 
	}

	@Test
	public void negativePrime()
	{

		try {
			PrimeGenerator gen = new PrimeGenerator(-10,10);

		}catch(Exception e) {
			assertEquals("Wrong input values" ,e.getMessage());


		}
	}
}
