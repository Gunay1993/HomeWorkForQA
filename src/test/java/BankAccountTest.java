import az.gov.etaxes.proxy.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTest {
  BankAccount account;
  @BeforeAll
  public static void start() {
    System.out.println("Bank sistemi başladı");
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

  }
@Test
@DisplayName("balans emeliyyati")
  public void testWithdraw() {
account.deposit(200);
account.withdraw(50);
assertEquals(150, account.getBalance());
  }

  @AfterEach
  @DisplayName("her testden sora obyekti null edir")
  public void nullObyekt() {
   account=null;
    System.out.println("Test tamamlandı-obykti null edir (after each)");

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


  @AfterAll
 @DisplayName("butun testler bitdikden sora icra olur")
  public static void close() {
    System.out.println("Bank sistemi bitdi-afterAll");
  }

}
