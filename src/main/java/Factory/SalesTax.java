package Factory;

abstract class SalesTax {

  protected double rate;

  abstract void getRate();

  public double calculateTax(double amount) {
    return amount * rate;
  }
}
