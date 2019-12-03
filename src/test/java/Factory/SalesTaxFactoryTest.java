package Factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SalesTaxFactoryTest {

  private SalesTaxFactory salesTaxFactory;

  @BeforeEach
  void init() {
    salesTaxFactory = new SalesTaxFactory();
  }

  @Test
  void gothenburgTax_of100_shouldShow33() {
    SalesTax cityTax = salesTaxFactory.makeTaxObject("gothenburg");
    cityTax.getRate();

    assertEquals(33, cityTax.calculateTax(100));
  }

  @Test
  void gothenburgTax_of500_shouldShow165() {
    SalesTax cityTax = salesTaxFactory.makeTaxObject("gothenburg");
    cityTax.getRate();

    assertEquals(165, cityTax.calculateTax(500));
  }

  @Test
  void malmoTax_of100_shouldShow34() {
    SalesTax cityTax = salesTaxFactory.makeTaxObject("malmo");
    cityTax.getRate();

    assertEquals(34, cityTax.calculateTax(100));
  }

  @Test
  void malmoTax_of500_shouldShow170() {
    SalesTax cityTax = salesTaxFactory.makeTaxObject("malmo");
    cityTax.getRate();

    assertEquals(170, cityTax.calculateTax(500));
  }

}
