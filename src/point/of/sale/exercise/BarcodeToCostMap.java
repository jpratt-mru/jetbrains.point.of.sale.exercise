package point.of.sale.exercise;

import java.util.HashMap;

class BarcodeToCostMap {
	
	HashMap<String, String> ht = new HashMap<>();
	
	public String costFor(String barcode) {
		return ht.get(barcode);
	}

	public void addMapping(String barcode, String costDisplay) {
		ht.put(barcode, costDisplay);
	}

	public boolean contains(String barcode) {
		return ht.containsKey(barcode);
	}
}
