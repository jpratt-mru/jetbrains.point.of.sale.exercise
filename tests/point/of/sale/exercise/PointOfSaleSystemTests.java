package point.of.sale.exercise;

import org.junit.jupiter.api.Disabled;
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

	@Test
	@DisplayName("a barcoded item worth 2 dollars returns '$2.00'")
	void test03() {
		PointOfSaleSystem poss = new PointOfSaleSystem();
		poss.onBarcode("291");
		assertThat(poss.isDisplaying()).isEqualTo("$2.00");
	}
	
	@Test
	@DisplayName("a barcoded item worth 3 cents returns '$0.03'")
	void test04() {
		PointOfSaleSystem poss = new PointOfSaleSystem();
		poss.onBarcode("A431S");
		assertThat(poss.isDisplaying()).isEqualTo("$0.03");
	}
}

