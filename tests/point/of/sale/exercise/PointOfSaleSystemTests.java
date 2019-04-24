package point.of.sale.exercise;

import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointOfSaleSystemTests {

	@Test
	@DisplayName("an empty barcode returns 'unknown item'")
	void test01() {
		PointOfSaleSystem poss = new PointOfSaleSystem();
		poss.onBarcode("");
		assertThat(poss.isDisplaying()).isEqualTo("unknown item");
	}
	
	@Test
	@DisplayName("a barcoded item worth 1 dollar returns '$1.00'")
	void test02() {
		PointOfSaleSystem poss = new PointOfSaleSystem();
		poss.onBarcode("58");
		assertThat(poss.isDisplaying()).isEqualTo("$1.00");
	}

}

