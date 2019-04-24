package point.of.sale.exercise;

import java.util.Hashtable;

class BarcodeToCostMap {
	
	Hashtable<String, String> ht = new Hashtable<>();
	
	
	public String costFor(String barcode) {
		if (!ht.containsKey(barcode)) {
			return "unknown item";
		} else {
			return ht.get(barcode);
		}
		
	}

	public void addMapping(String barcode, String costDisplay) {
		ht.put(barcode, costDisplay);
	}
}
