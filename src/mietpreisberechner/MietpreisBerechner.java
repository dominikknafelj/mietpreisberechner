package mietpreisberechner;

/**
 *
 * @author dominik
 */
public class MietpreisBerechner {
	
	/**
         * Methode zur Mietpreisberechnung
         * @param tage - Anzahl der Miettage
         * @param km - gefahrene Kilometer
         * @throws UngueltigeTagesanzahlAusnahme wird durch die Methode validiereParameter ausgeloest
         * @throws UngueltigeKilometerangabeAusnahme wird durch die Methode validiereParameter ausgeloest
         * @return - Rueckgabe des zu berechenen Betrages in Cent
         */
	public long berechneMietpreis(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme {
            // wenn weniger als 14 Tage gemietet wurde, berechne nach Kurzzeit-, ansonsten als Langzeitvermietung.
            return(tage < 14)? this.kurzZeitVerleih(tage, km) : this.langZeitVerleih(tage, km);
	}
        
        /**
         * Methode zur Berechnung des Rechnungsbetrages bei einem Kurzzeitverleih
         * @param tage - Anzahl der Miettage
         * @param km - gefahrene Kilometer
         * 
         * @throws UngueltigeTagesanzahlAusnahme wird durch die Methode validiereParameter ausgeloest
         * @throws UngueltigeKilometerangabeAusnahme wird durch die Methode validiereParameter ausgeloest
         * 
         * @return - Rueckgabe des zu berechenen Betrages in Cent
         */
        private long kurzZeitVerleih(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme{
            long pauschale = 4000;
            long mietgebuehren = tage * 2000;
            long kmTarif =  15;
            long unfreieKm = km - 200;
            
            this.validiereParameter(tage, km);
            // Wenn mehr als 200km gefahren wurden, berechne kmgebuehr
            long kilometergebuehr = (km<=200)? 0 : (kmTarif*unfreieKm);
  
            return pauschale + kilometergebuehr + mietgebuehren ;
            
        }
        /**
         * Methode zur Berechnung des Rechnungsbetrages bei einem Langzeitzeitverleih         * 
         * @param tage - Anzahl der Miettage
         * @param km - gefahrene Kilometer
         * 
         * @throws UngueltigeTagesanzahlAusnahme wird durch die Methode validiereParameter ausgeloest
         * @throws UngueltigeKilometerangabeAusnahme wird durch die Methode validiereParameter ausgeloest
         * 
         * @return - Rueckgabe des zu berechenen Betrages in Cent
         */
        private long langZeitVerleih(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme{
            long pauschale = 30000;
            long kmTarif =  12;
            // validiere die Parameter
            this.validiereParameter(tage, km);
            return pauschale + kmTarif * km;
        }
        
        /**
         * 
         * @param tage tage parameter
         * @param km kilometer parameter
         * @throws UngueltigeTagesanzahlAusnahme wird geworfen, wenn tage 0 oder negativ ist
         * @throws UngueltigeKilometerangabeAusnahme wird geworfen, wenn km negativ ist
         */
        private void validiereParameter(int tage, int km) throws UngueltigeTagesanzahlAusnahme, UngueltigeKilometerangabeAusnahme
        {
            // validiere tage
            if (tage < 1) {
                throw new UngueltigeTagesanzahlAusnahme();
            }
            
            // validiere km
            if (km < 0) {
                throw new UngueltigeKilometerangabeAusnahme();
            }
        }
        
	
}
