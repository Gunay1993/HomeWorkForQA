package az.gov.etaxes.proxy;

public class SavingsAccount extends  Account{

  @Override
  public double calculateInterest() {
    double balance = super.getBalance();
    double faiz = 0.50;
    return balance * faiz;
  }
  }

