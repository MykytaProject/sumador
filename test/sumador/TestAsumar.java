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

}
