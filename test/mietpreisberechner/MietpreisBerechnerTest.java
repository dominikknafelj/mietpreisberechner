package mietpreisberechner;
public class MietpreisBerechnerTest extends junit.framework.TestCase {
	
	protected MietpreisBerechner m;
	
	public void setUp() {
		m = new MietpreisBerechner();
	}
	/**
         * Folgende Methoden puefen auf den korrekten Rueckgabewert bei festelegten Parametern
         */
	public void testA() throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
            assertEquals("pruefe Rueckgabewert bei 1 Tag, 10km", 6000, m.berechneMietpreis(1, 10) );
	}

	public void testB() throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
            assertEquals("pruefe Rueckgabewert bei 2 Tage, 0km", 8000, m.berechneMietpreis(2, 0) );
	}

	public void testC() throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
            assertEquals("pruefe Rueckgabewert bei 4 Tage, 200km", 12000, m.berechneMietpreis(4, 200) );
        }

	public void testD() throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
		assertEquals("pruefe Rueckgabewert bei 8 Tage, 250km", 20750, m.berechneMietpreis(8, 250) );
	}

	public void testE() throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
		assertEquals("pruefe Rueckgabewert bei 11 Tag, 199km", 26000, m.berechneMietpreis(11, 199) );
	}

	public void testF() throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
		assertEquals("pruefe Rueckgabewert bei 13 Tage, 150km", 30000, m.berechneMietpreis(13, 150) );
	}

	public void testG() throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
		assertEquals("pruefe Rueckgabewert bei 14 Tage, 150km", 31800, m.berechneMietpreis(14, 150) );
	}

	public void testH() throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
		assertEquals("pruefe Rueckgabewert bei 20 Tage, 250km", 33000, m.berechneMietpreis(20, 250) );
	}
        
        public void testNegativeTage() {
		try {
			m.berechneMietpreis(-10, 10);
			fail("Bei negativer Tagesanzahl wird keine Ausnahme geworfen.");
		} catch (UngueltigeTagesanzahlAusnahme e) {
			// das sollte passieren
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei negativer Tagesanzahl wird falsche Ausnahme geworfen.");
		}
	}

	public void testNullTage() {
		try {
			m.berechneMietpreis(0, 10);
			fail("Bei 0 Tagen wird keine Ausnahme geworfen.");
		} catch (UngueltigeTagesanzahlAusnahme e) {
			// das sollte passieren
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei 0 Tagen wird falsche Ausnahme geworfen.");
		}		
	}

	public void testPositiveTage() {
		try {
			assertEquals("falscher Mietpreisberechnet", 30120, m.berechneMietpreis(20, 10));
		} catch (UngueltigeTagesanzahlAusnahme e) {
			fail("Bei positiver Tagesanzahl wird Ausnahme geworfen, sollte aber nicht passieren.");
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei positiver Tagesanzahl wird Ausnahme geworfen, sollte aber nicht passieren.");
		}	
	}
	
	public void testNegativeKilometer() {
		try {
			m.berechneMietpreis(10, -10);
			fail("Bei negativer Kilometeranzahl wird keine Ausnahme geworfen.");
		} catch (UngueltigeTagesanzahlAusnahme e) {
			fail("Bei negativer Kilometeranzahl wird falsche Ausnahme geworfen.");
		} catch (UngueltigeKilometerangabeAusnahme e) {
			// das sollte passieren
		}
	}
	
	public void testNullKilometer() {
		try {
			assertEquals("falscher Mietpreisberechnet", 8000, m.berechneMietpreis(2, 0));
		} catch (UngueltigeTagesanzahlAusnahme e) {
			fail("Bei 0 Kilometern wird Ausnahme geworfen, sollte aber nicht passieren.");
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei 0 Kilometern wird Ausnahme geworfen, sollte aber nicht passieren.");
		}	
	}
	
	public void testPositiveKilometer() {
		try {
			assertEquals("falscher Mietpreisberechnet", 20000, m.berechneMietpreis(2, 1000));
		} catch (UngueltigeTagesanzahlAusnahme e) {
			fail("Bei positiver Kilometeranzahl wird Ausnahme geworfen, sollte aber nicht passieren.");
		} catch (UngueltigeKilometerangabeAusnahme e) {
			fail("Bei positiver Kilometeranzahl wird Ausnahme geworfen, sollte aber nicht passieren.");
		}	
	}
}