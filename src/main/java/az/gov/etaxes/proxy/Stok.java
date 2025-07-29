package az.gov.etaxes.proxy;

import java.util.HashMap;

public class Stok {
  public  void stokStatus(){
    HashMap<String, Integer> stok = new HashMap<>();
    stok.put("Milk",10);
    stok.put("Bread",5);
    stok.put("Cheese",0);
    for (int stokDurum:stok.values()) {
      if (stokDurum == 0) {
        System.out.println("Stokda yoxdur");
      }

    }

   for (String mehsulunKeyi:stok.keySet()){
if (stok.get(mehsulunKeyi)==0){
  System.out.println(mehsulunKeyi + " stokda yoxdur");
}
   }
      }
    }

