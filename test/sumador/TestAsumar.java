package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAsumar {

	 @Test
	    public void testUnDigito() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.sumativo("7");
	        assertEquals("7 = 7",resultado );
	    }
	 
	 @Test
	    public void testNegativo() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.negativo("-5");
	        assertEquals("Negativo. Siempre negativo",resultado );
	    }
	 @Test
	    public void testTotal() {
	        ASumar sumi = new ASumar();
	        int resultado = sumi.total("15");
	        assertEquals(7,resultado );
	    }
}
