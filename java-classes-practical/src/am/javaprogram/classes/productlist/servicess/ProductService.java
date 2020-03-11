package am.javaprogram.classes.productlist.servicess;

import am.javaprogram.classes.productlist.ProductGenerator;
import am.javaprogram.classes.productlist.models.Product;

public class ProductService {
    private Product[] productData = new Product[10];

    public ProductService() {
        ProductGenerator generator = new ProductGenerator();
        for (int i = 0; i < productData.length; i++) {
            productData[i] = generator.generateProduct();
        }
    }

    public void printData(Product[] array) {
        for (Product book : array) {
            if (book != null) {
                System.out.println(book.toString());
            }
        }
    }


    public Product[] getByPrice(int price) {
        int countFoundData = 0;
        Product[] foundData = new Product[productData.length];
        for (Product product : productData) {
             if(product.getPrice() < price){
                 foundData[countFoundData++] =product;
             }
        }
        return foundData;
    }

    public Product[] getByName(String name) {
        int countFoundData = 0;
        Product[] foundData = new Product[productData.length];
        for (Product product : productData) {
            if(product.getName().equals(name)){
                foundData[countFoundData++] =product;
            }
        }
        return foundData;
    }

    public Product[] getByMoreGuaranty() {
        int countFoundData = 0;
        Product[] foundData = new Product[productData.length];

        return foundData;
    }
}
