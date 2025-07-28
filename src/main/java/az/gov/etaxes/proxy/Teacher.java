package az.gov.etaxes.proxy;

public class Teacher {


  private String name;
  private  String surname;
  private double salary;



  public String getName() {
    return name;
  }
  public double getSalary(){
    return  salary;
  }

public  String getSurname(){
    return  surname;
}


  public void setName(String name){
    this.name=name;
  }

  public void setSurname(String surname){
    this.surname=surname;
  }

  public void setSalary(double salary) {
    double salarymetod=300;
    if (salary<salarymetod){
      System.out.println("Maas 300 den asagi ola bilmez");
      return;
    }
    this.salary = salary;
  }
}
