package point.of.sale.exercise;

class PointOfSaleSystem {

	private BarcodeToCostMap barcodeToCostMap;
	private String lastBarcodeRead = "";

	public PointOfSaleSystem(BarcodeToCostMap barcodeToCostMap) {
		this.barcodeToCostMap = barcodeToCostMap;
	}

	public void onBarcode(String barcode) {
		lastBarcodeRead = barcode;
	}

	public String isDisplaying() {
		return costForItemWithBarcode();
	}

	private String costForItemWithBarcode() {
		return barcodeToCostMap.contains(lastBarcodeRead) ? barcodeToCostMap.costFor(lastBarcodeRead) : "unknown item";
	}
}