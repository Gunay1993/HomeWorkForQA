package az.gov.etaxes.proxy;

public abstract class Account {
private double balance;

public double getBalance() {
  return balance;
}

public void setBalance(double balance) {
  this.balance = balance;
}
public  abstract double calculateInterest();
}