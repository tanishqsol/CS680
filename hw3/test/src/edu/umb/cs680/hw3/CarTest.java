package edu.umb.cs680.hw3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {
	
	private String[] carToStringArray(Car car) {
		String[] carStringArray = new String[3];
		carStringArray[0] = car.getMake();
		carStringArray[1] = car.getModel();
		carStringArray[2] = car.getYear() + "";
		return carStringArray;
	}
	
	@Test
	public void verifyCarEqualityWithMakeModelYear() {
		String[] expected = {"A", "B", "1"};
		Car c1 = new Car("A", "B", 1);
		assertArrayEquals(expected, carToStringArray(c1));
	}
	
	@Test
	public void verifyCar2EqualityWithMakeModelYear() {
		String[] expected = {"ABC", "BCD", "2022"};
		Car c2 = new Car("ABC", "BCD", 2022);
		assertArrayEquals(expected, carToStringArray(c2));
	}

}
