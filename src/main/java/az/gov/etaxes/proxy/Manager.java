package az.gov.etaxes.proxy;

public class Manager extends  Employee {


  public Manager() {
    super();
    System.out.println("Manager yaradıldı");
  }

    public int calculateSalary () {
      return 1500;
    }

}
