package com.andreasekman.pattern.factory;

public class GothenburgTax extends SalesTax {

  @Override
  public void getRate() {
    rate = 0.33;
  }
}
