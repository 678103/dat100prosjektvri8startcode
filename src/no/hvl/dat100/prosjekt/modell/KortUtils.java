package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		Kort[] kort = samling.getSamling();
	    int antall = samling.getAntalKort();

	    for (int i = 0; i < antall - 1; i++) {
	        for (int j = 0; j < antall - i - 1; j++) {
	            if (kort[j].compareTo(kort[j + 1]) > 0) {
	                Kort midlertidig = kort[j];
	                kort[j] = kort[j + 1];
	                kort[j + 1] = midlertidig;
	            }
	        }
	    }
	}	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		Kort[] kort = samling.getSamling();
        int antall = samling.getAntalKort();
        Random rand = new Random();

        for (int i = antall - 1; i > 0; i--) {
            int byttPlass = rand.nextInt(i + 1);

            Kort midlertidig = kort[i];
            kort[i] = kort[byttPlass];
            kort[byttPlass] = midlertidig;
        }
	}
	
}
