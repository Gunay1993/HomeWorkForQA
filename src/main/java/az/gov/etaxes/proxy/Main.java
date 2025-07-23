package az.gov.etaxes.proxy;

public class Main {

  public static void main(String[] args) {
    Vehicle v = new Bicycle();
    v.move();


    MessageSender email = new EmailSender();
    MessageSender sms = new SMSSender();

    email.send();
    sms.send();

    Employee e1 = new Employee();
    System.out.println("Employee maaşı: " + e1.calculateSalary());

    Employee e2 = new Manager();
    System.out.println("Manager maaşı: " + e2.calculateSalary());
  }
  }
