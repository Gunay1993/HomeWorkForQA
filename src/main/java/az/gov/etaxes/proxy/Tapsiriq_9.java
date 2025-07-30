package az.gov.etaxes.proxy;

import java.util.ArrayList;
import java.util.Scanner;

public class Tapsiriq_9 {

  public void bolme() {

    {
      ArrayList<Integer> ededler = new ArrayList<>();
      ededler.add(10);
      ededler.add(20);
      ededler.add(30);
      Scanner index = new Scanner(System.in);
      System.out.println("Eded(index) daxil edin");
      int indexEded = index.nextInt();

        try {
          double bolmeOperat = 100 / ededler.get(indexEded);
          System.out.println("Netice: " + bolmeOperat);
        } catch (IndexOutOfBoundsException e) {
          System.out.println("Daxil edilen eded Listde yoxdur");
        } catch (ArithmeticException e) {
          System.out.println("0-a bölmək olmaz");

        }
      }
    }
  }
