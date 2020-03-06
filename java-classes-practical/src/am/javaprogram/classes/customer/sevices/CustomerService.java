package am.javaprogram.classes.customer.sevices;

import am.javaprogram.classes.customer.CustomerGenerator;
import am.javaprogram.classes.customer.models.Customer;

public class CustomerService {
  private Customer[] customersData = new Customer[10];

  public CustomerService() {
    CustomerGenerator generator = new CustomerGenerator();
    for (int i = 0; i < customersData.length; i++) {
      customersData[i] = generator.generateCustomer();
    }
  }

  public void printData(Customer[] array) {
    for (Customer customer : array) {
     if(customer != null){
       System.out.println(customer.toString());
     }
    }
  }

  private void setNumberCartWichStartZero() {
    CustomerGenerator generator = new CustomerGenerator();
    for (Customer customer : customersData) {
      if (customer.getNumberCart().charAt(0) == '0') {
        customer.setNumberCart(generator.generateNumberOfAccountOrCart());
        setNumberCartWichStartZero();
      }
    }
  }

  public Customer[] getListByIntervalOfNumberCart(long intervalStart, long intervalEnd) {
    setNumberCartWichStartZero();
    int size = 0;
    Customer[] resultData = new Customer[customersData.length];
    for (Customer customer : customersData) {
      long customerNumberCart = Long.parseLong(customer.getNumberCart());
      if (customerNumberCart > intervalStart && customerNumberCart < intervalEnd) {
        resultData[size++] = customer;
      }
    }
    return resultData;
  }

  public Customer[] sort() {
    setNumberCartWichStartZero();
    Customer temp;
    for (int j = 0; j < customersData.length; j++) {
      for (int i = j + 1; i < customersData.length; i++) {
        if (customersData[i].getName().compareTo(customersData[j].getName()) < 0) {
          temp = customersData[j];
          customersData[j] = (customersData[i]);
          customersData[i] = temp;
        }
      }
    }
    return customersData;
  }
}
