package am.javaprogram.classes.customer;

import am.javaprogram.classes.customer.models.Customer;

import java.util.Random;

public class CustomerGenerator {
  private final String[] NAMES = {
    "Tigran", "Vardan", "Ashot", "Vahram", "Valod", "Gurgen", "Ishxan", "Varazdat", "Gevorg"
  };

  public CustomerGenerator() {}

  public Customer generateCustomer() {
    Customer generate =
        new Customer(
            NAMES[getRangeByMinMax(0, NAMES.length - 1)],
            generateNumberOfAccountOrCart(),
            generateNumberOfAccountOrCart());
    return generate;
  }

  private int getRangeByMinMax(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

  public String generateNumberOfAccountOrCart() {
    StringBuffer generatedNumber = new StringBuffer();
    for (int i = 0; i < 12; i++) {
      generatedNumber.append(getRangeByMinMax(0, 9));
    }
    return generatedNumber.toString();
  }
}
