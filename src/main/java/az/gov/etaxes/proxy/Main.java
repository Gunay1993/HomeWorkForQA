package az.gov.etaxes.proxy;

public class Main {

  public static void main(String[] args) {
    Vehicle v = new Bicycle();
    v.move();


    MessageSender email = new EmailSender();
    MessageSender sms = new SMSSender();

    email.send();
    sms.send();
  }
  }
