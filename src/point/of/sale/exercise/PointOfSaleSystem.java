package point.of.sale.exercise;

class PointOfSaleSystem {

	String lastBarcodeRead = "";

	public void onBarcode(String barcode) {
		lastBarcodeRead = barcode;
	}

	public String isDisplaying() {
		if (lastBarcodeRead.isEmpty()) {
			return "unknown item";
		} else {
			return costForItemWithBarcode(lastBarcodeRead);
		}
	}

	private String costForItemWithBarcode(String barcode) {
		BarcodeToCostMap barcodeToCostMap = new BarcodeToCostMap();
		return barcodeToCostMap.costFor(barcode);
	}


}