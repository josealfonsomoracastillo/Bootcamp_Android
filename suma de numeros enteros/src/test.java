import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testSumaNumerosNaturales {
	
	SumatoriaNumerosNaturales suma = new SumatoriaNumerosNaturales(10);
	SumatoriaNumerosNaturales suma2 = new SumatoriaNumerosNaturales(20);
	SumatoriaNumerosNaturales suma3 = new SumatoriaNumerosNaturales(7);
	
	
	@Test
	void test() {
		Assertions.assertEquals(55, suma.sumaNumerosNaturales());
	}
	@Test
	void test2() {
		Assertions.assertEquals(210, suma2.sumaNumerosNaturales());
	}

  Test
   void test3() {
	Assertions.assertEquals(28, suma3.sumaNumerosNaturales());
	} 

}
