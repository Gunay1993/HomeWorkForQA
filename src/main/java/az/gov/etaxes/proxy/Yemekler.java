package az.gov.etaxes.proxy;

import java.util.ArrayList;

public class Yemekler {

  public void yemekCesidleri() {
    ArrayList<String> cesidler = new ArrayList<>();
    cesidler.add("Pizza");
    cesidler.add("Soup");
    cesidler.add("Salad");

    for(String yemek: cesidler){
      System.out.println(yemek);

    }

    cesidler.remove("Soup");
    System.out.println(cesidler);
    cesidler.add("Dessert");
    for (String tamCesid: cesidler){
      System.out.println(tamCesid);
    }
  }
}
