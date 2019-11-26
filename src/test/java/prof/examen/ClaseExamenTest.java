package prof.examen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {
			//Prueba factorizacion 6
			@Test
			public void testFactor6() throws Exception{
				List<Integer> factores = new ArrayList<Integer>(Arrays.asList(2, 3));
				assertEquals(factores, ClaseExamen.primos(6));
			}
			
			//Prueba factorizacion 13
			@Test
			public void testFactor13() throws Exception{
				List<Integer> factores = new ArrayList<Integer>(Arrays.asList(13));
				assertEquals(factores, ClaseExamen.primos(13));
			}
			
			//Prueba factorizacion 25
			@Test
			public void testFactor25() throws Exception{
				List<Integer> factores = new ArrayList<Integer>(Arrays.asList(5, 5));
				assertEquals(factores, ClaseExamen.primos(25));
			}
			
			//Prueba factorizacion exception
			@Test(expected=EntradaInvalida.class)
			public void testFactorException() throws Exception{
				ClaseExamen.primos(-1);
			}
	
}
