package point.of.sale.exercise;

import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointOfSaleSystemTests {

	@Test
	@DisplayName("an empty barcode returns 'unknown item'")
	void test() {
		PointOfSaleSystem poss = new PointOfSaleSystem();
		poss.onBarcode("");
		assertThat(poss.lastResult()).isEqualTo("unknown item");
	}

}
