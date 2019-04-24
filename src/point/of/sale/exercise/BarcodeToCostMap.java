package point.of.sale.exercise;

import java.util.Hashtable;

class BarcodeToCostMap {
	public String costFor(String barcode) {
		Hashtable<String, String> ht = new Hashtable<>();
		ht.put("58", "$1.00");
		ht.put("291", "$2.00");
		ht.put("A431S", "$0.03");

		return ht.get(barcode);
	}
}
