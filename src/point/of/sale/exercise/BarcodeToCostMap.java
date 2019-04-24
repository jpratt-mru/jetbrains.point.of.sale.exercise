package point.of.sale.exercise;

import java.util.Hashtable;

class BarcodeToCostMap {
	
	Hashtable<String, String> ht = new Hashtable<>();
	
	
	public String costFor(String barcode) {
		return ht.get(barcode);
	}

	public void addMapping(String barcode, String costDisplay) {
		ht.put(barcode, costDisplay);
	}
}
