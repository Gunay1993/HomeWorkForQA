package az.gov.etaxes.proxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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

      public void kontakNumber(){
        Set<String> numbers = new HashSet<>();
        int count=0;
        numbers.add("0501234567");
        numbers.add("0517654321");
        numbers.add("0501234567");
        numbers.add("0709988776");
        for(String number: numbers){
          System.out.println(number);
          count++;

        }
        System.out.println("Kontaktaki tekrarlanmayan nomreler: " + count);
      }
    }

