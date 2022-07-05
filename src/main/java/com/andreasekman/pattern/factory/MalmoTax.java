package com.andreasekman.pattern.factory;

public class MalmoTax extends SalesTax {

  @Override
  public void getRate() {
    rate = 0.34;
  }
}
