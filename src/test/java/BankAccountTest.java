import az.gov.etaxes.proxy.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTest {
  BankAccount account;
  @BeforeAll
  public static void start() {
    System.out.println("Bank sistemi başladı-beferoall");
  }

  @Test
  @DisplayName("100 AZN yatırıldıqda balans 100 olmalıdır")
  public void balansCheck() {
  account.deposit(100);
    assertEquals(100,account.getBalance());
  }
 @BeforeEach
 @DisplayName("her test islemezden evvel yeni obyekt yaradir")
  public void crateobyekt() {
 account =new BankAccount("12345", "Əli Məmmədov");
System.out.println("BeforeEach-her testden evvel metod yaradir");
  }
@Test
@DisplayName("balans emeliyyati")
  public void testWithdraw() {
account.deposit(200);
account.withdraw(50);
assertEquals(150, account.getBalance());
  }


  @Test
  @DisplayName("Balansin 0 oldugunu yoxluyur")
  public  void testGetBalance(){
    assertEquals(0, account.getBalance());
  }
  @Test
  @DisplayName("hesab nomresini yoxluyur")
  public void testAccountNumber(){
   assertEquals("12345" , account.getAccountNumber());
  }

  @Test
  @DisplayName("hesabin sahibini yoxluyur")
  public void testOwnerName(){
    assertEquals("Əli Məmmədov" , account.getOwnerName());
  }
  @ParameterizedTest
  @ValueSource(doubles = {10.0, 50.0, 100.0, 500.0, 1000.0})
  @DisplayName("Müxtǝlif mǝblǝğlǝrlǝ pul yatırma testi")
  public  void depositCheck(double amount){
    account.deposit(amount);
    assertEquals(amount, account.getBalance());
  }

  @AfterEach
  @DisplayName("her testden sora obyekti null edir")
  public void nullObyekt() {
    account=null;
    System.out.println("Test tamamlandı-obykti null edir (after each)");

  }


  @AfterAll
 @DisplayName("butun testler bitdikden sora icra olur")
  public static void close() {
    System.out.println("Bank sistemi bitdi-afterAll");
  }




}
