package point.of.sale.exercise;

class PointOfSaleSystem {

	BarcodeToCostMap barcodeToCostMap;
	String lastBarcodeRead = "";

	public PointOfSaleSystem(BarcodeToCostMap barcodeToCostMap) {
		this.barcodeToCostMap = barcodeToCostMap;
	}

	public void onBarcode(String barcode) {
		lastBarcodeRead = barcode;
	}

	public String isDisplaying() {		
		return costForItemWithBarcode(lastBarcodeRead);
	}

	private String costForItemWithBarcode(String barcode) {
		return barcodeToCostMap.costFor(barcode);
	}


}