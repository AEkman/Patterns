package Factory;

public class MalmoTax extends SalesTax {

  @Override
  void getRate() {
    rate = 0.34;
  }
}
