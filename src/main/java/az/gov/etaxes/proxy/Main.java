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

    Vehicle v1 = new Car();
    v1.start();

    Teacher teacher = new Teacher();
    teacher.setName("Gunay");
    teacher.setSurname("Abbasova");
    teacher.setSalary(250);
    System.out.println(teacher.getName() + " " + teacher.getSurname());
    System.out.println("Maas: " + teacher.getSalary());

    Manager manager = new Manager();
    Dog d = new Dog();
    d.makeSound();
    SavingsAccount acc = new SavingsAccount();
    acc.setBalance(1000);
    System.out.println("Faiz: " + acc.calculateInterest());
    Students s = new Students();
    double ortabal = s.ortaBalHesabla();
    System.out.println("Telebenin ortalama bali: " + ortabal);
    Yemekler y = new Yemekler();
    y.yemekCesidleri();
    Stok st = new Stok();
    st.stokStatus();
    st.kontakNumber();

    try {
      String reng = "qirmizi";
      int rengdenReqeme = Integer.parseInt((String) reng);
    }catch (Exception e){
      System.out.println("Yalnız rəqəm daxil olunmalıdır");
    }
  }
  }
