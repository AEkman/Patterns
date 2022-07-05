package com.andreasekman.pattern.factory;

public class SalesTaxFactory {

  public SalesTax makeTaxObject(String city) {

    switch (city) {
      case "gothenburg":
        return new GothenburgTax();
      case "malmo":
        return new MalmoTax();
      default:
        return null;
    }
  }
}
