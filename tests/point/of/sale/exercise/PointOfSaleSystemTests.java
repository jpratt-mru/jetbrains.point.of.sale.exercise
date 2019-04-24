package point.of.sale.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointOfSaleSystemTests {

	private BarcodeToCostMap barcodeToCostMap;
	PointOfSaleSystem poss;
	
	@BeforeEach
	void setUp() {
		barcodeToCostMap = new BarcodeToCostMap();
		barcodeToCostMap.addMapping("58", "$1.00");
		barcodeToCostMap.addMapping("291", "$2.00");
		barcodeToCostMap.addMapping("A431S", "$0.03");
		
		poss = new PointOfSaleSystem(barcodeToCostMap);
	}
	
	@Test
	@DisplayName("an empty barcode returns 'unknown item'")
	void test01() {
		poss.onBarcode("");
		assertThat(poss.isDisplaying()).isEqualTo("unknown item");
	}
	
	@Test
	@DisplayName("a barcoded item worth 1 dollar returns '$1.00'")
	void test02() {
		poss.onBarcode("58");
		assertThat(poss.isDisplaying()).isEqualTo("$1.00");
	}

	@Test
	@DisplayName("a barcoded item worth 2 dollars returns '$2.00'")
	void test03() {
		poss.onBarcode("291");
		assertThat(poss.isDisplaying()).isEqualTo("$2.00");
	}
	
	@Test
	@DisplayName("a barcoded item worth 3 cents returns '$0.03'")
	void test04() {
		poss.onBarcode("A431S");
		assertThat(poss.isDisplaying()).isEqualTo("$0.03");
	}
}

