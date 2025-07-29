package az.gov.etaxes.proxy;

public class Students {



  public double ortaBalHesabla() {
    double[] ballar={85.5, 90.0, 76.3, 64.0, 92.5};
    double result=0;
    double cem=0;
    int count=0;
    for(double bal : ballar){
      System.out.println("Bal: " + bal);

      cem+=bal;
      count++;

    }
   return result=cem/count;
  }

}
