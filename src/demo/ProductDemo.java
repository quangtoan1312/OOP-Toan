package demo;

import entity.Product;

import java.util.Scanner;

public class ProductDemo extends Product{

    public ProductDemo(int id, String name, int categoryId) {
        super(id, name, categoryId);
    }

    /** create test product with input
     *
     */
    public void createProductTest(){
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        String name = input.next();
        int categoryId = input.nextInt();
        Product productTest = new Product(id, name, categoryId);
        input.close();
        System.out.println(productTest);
    }

    public void printProduct(Product product){
        System.out.println(product);
    }

}
