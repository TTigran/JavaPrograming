package am.javaprogram.classes.customer.models;

public class Customer  {
  private int id;
  private String name;
  private String numberAccount;
  private String numberCart;
  static int noOfObjects = 0;

  {
    noOfObjects += 1;
  }

  public Customer() {}

  public Customer(String name, String numberAccount, String numberCart) {
    this.id = noOfObjects;
    this.name = name;
    this.numberAccount = numberAccount;
    this.numberCart = numberCart;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getNumberCart() {
        return numberCart;
    }

    public void setNumberCart(String numberCart) {
        this.numberCart = numberCart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberAccount='" + numberAccount + '\'' +
                ", numberCart='" + numberCart + '\'' +
                '}';
    }
}
