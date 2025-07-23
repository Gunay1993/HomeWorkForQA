package az.gov.etaxes.proxy;

public class Overload {

  public static void main(String[] args) {
    printInfo("Günay");
    printInfo("Günay", 32);

    printInfo("Günay", 32, "Texniki Universiteti");
    int cavab2eded = multiply(4, 5);
    System.out.println(" 2 ededin hasil: " + cavab2eded);

    int cavab3eded = multiply(4, 5, 6);
    System.out.println(" 3 ededin hasil: " + cavab3eded);
    double onluqCavab = multiply(1.12, 1.25);
    System.out.printf("%.2f", multiply(1.12, 1.25));
    int cvbKvadrat = area(5);
    System.out.println("kvadratin sahesi : " + cvbKvadrat);
    int cvbDuzbucaq = area(10, 7);
    System.out.println("duzbucaqli sahesi : " + cvbDuzbucaq);
    double daireninSahesi = area(4);
    System.out.println("dairenin Sahesi: " + daireninSahesi);


  }

  public static void printInfo(String ad) {
    System.out.println("Ad: " + ad);
  }

  public static void printInfo(String ad, int yas) {
    System.out.println("Ad və yasi: " + ad + " " + yas);
  }

  public static void printInfo(String ad, int yas, String uniAdi) {
    System.out.println(ad + " " + yas + " yaşındadır." + " " + uniAdi);
  }

  public static int multiply(int a, int b) {
    int netice = a * b;
    return netice;
  }

  public static int multiply(int a, int b, int c) {
    int netice = a * b * c;
    return netice;
  }

  public static double multiply(double a, double b) {
    return a * b;
  }

  public static int area(int a) {
    int netice = a * a;
    return netice;
  }

  public static int area(int l, int w) {
    int netice = l * w;
    return netice;
  }

  public static double area(double r) {
    double netice = Math.PI * r * r;
    return netice;

  }

  public static void sendMessage(String msg) {

    System.out.println(msg);}

  public static void sendMessage(String msg, int repeat) {
    for (int i = 0; i < repeat; i++) {
      System.out.println(msg);
    }
  }
  public static double convert(int cm) {
    double metr = cm / 100.0;
    return metr;
  }

  public static double convert(double kg){
    double qram = kg * 1000;
    return qram;
  }

}
