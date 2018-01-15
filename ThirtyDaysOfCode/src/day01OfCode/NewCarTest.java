package day01OfCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewCarTest {

	@Test
	public void NewCar() {
		Car paulCar = new Car(500, 2005.456, true);
		double result = paulCar.maxMilesPerFillUp();
		assertEquals(422.4, result);
	}

}
