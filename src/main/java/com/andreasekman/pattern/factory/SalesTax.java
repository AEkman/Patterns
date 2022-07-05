package com.andreasekman.pattern.factory;

public abstract class SalesTax {

  protected double rate;

  public abstract void getRate();

  public double calculateTax(double amount) {
    return amount * rate;
  }
}
