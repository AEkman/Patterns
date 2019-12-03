package Factory;

public class GothenburgTax extends SalesTax {

  @Override
  public void getRate() {
    rate = 0.33;
  }
}
