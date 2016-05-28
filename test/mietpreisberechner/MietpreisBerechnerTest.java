package mietpreisberechner;
public class MietpreisBerechnerTest extends junit.framework.TestCase {
	
	protected MietpreisBerechner m;
	
	public void setUp() {
		m = new MietpreisBerechner();
	}
	
	public void testA() {
            assertEquals("1 Tag, 10km", 6000, m.berechneMietpreis(1, 10) );
	}

	public void testB() {
            assertEquals("1 Tag, 10km", 8000, m.berechneMietpreis(2, 0) );
	}

	public void testC() {
            assertEquals("1 Tag, 10km", 12000, m.berechneMietpreis(4, 200) );
        }

	public void testD() {
		assertEquals("1 Tag, 10km", 20750, m.berechneMietpreis(8, 250) );
	}

	public void testE() {
		assertEquals("1 Tag, 10km", 26000, m.berechneMietpreis(11, 199) );
	}

	public void testF() {
		assertEquals("1 Tag, 10km", 30000, m.berechneMietpreis(13, 150) );
	}

	public void testG() {
		assertEquals("1 Tag, 10km", 31800, m.berechneMietpreis(14, 150) );
	}

	public void testH() {
		assertEquals("1 Tag, 10km", 33000, m.berechneMietpreis(20, 250) );
	}
}