package mietpreisberechner;

/**
 *
 * @author dominik
 */
public class MietpreisBerechner {
	
	// Hier einen javadoc - Kommentar einfuegen
	public long berechneMietpreis(int tage, int km) {
            return(tage < 14)? this.kurzZeitVerleih(tage, km) : this.langZeitVerleih(tage, km);
	}
        
        private long kurzZeitVerleih(int tage, int km){
            long pauschale = 4000;
            long mietgebuehren = tage * 2000;
            long kmTarif =  15;
            long unfreieKm = km - 200;
            long kilometergebuehr = (km<=200)? 0 : (kmTarif*unfreieKm);
            return pauschale + kilometergebuehr + mietgebuehren ;
            
        }
        private long langZeitVerleih(int tage, int km){
            long pauschale = 30000;
            long kmTarif =  12;
            return pauschale + kmTarif * km;
        }
        
	
}
