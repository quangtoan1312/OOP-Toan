package demo;

import dao.Database;
import entity.Accessory;
import entity.Category;
import entity.Product;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DatabaseDemo{
    static Database database = Database.getInstants();

    public static int insertTableTest(String name, Object row) {
        return Database.getInstants().insertTable(name, row);
    }

    public static ArrayList selectTableTest(String name) {
        return Database.getInstants().selectTable(name);
    }

    public static int updateTableTest(String name, Object row) {
        return Database.getInstants().updateTable(name, row);
    }

    public static boolean deleteTableTest(String name, Object row){
        return Database.getInstants().deleteTable(name, row);
    }

    public static void truncateTableTest(String name) {
        Database.getInstants().truncateTable(name);
    }

    /**
     * Create 10 random objects each table
     */
    public static void initDatabase(){
        Product product0 = new Product(0, "Acer Monitor", 6);
        Product product1 = new Product(1, "CPU", 4);
        Product product2 = new Product(2, "Main-board", 4);
        Product product3 = new Product(3, "RAM", 4);
        Product product4 = new Product(4, "HDD", 4);
        Product product5 = new Product(5, "SSD", 4);
        Product product6 = new Product(6, "VGA", 4);
        Product product7 = new Product(7, "PC Gaming 1", 2);
        Product product8 = new Product(8, "Laptop Dell", 0);
        Product product9 = new Product(9, "PC Văn Phòng 1", 3);

        insertTableTest("Product", product0);
        insertTableTest("Product", product1);
        insertTableTest("Product", product2);
        insertTableTest("Product", product3);
        insertTableTest("Product", product4);
        insertTableTest("Product", product5);
        insertTableTest("Product", product6);
        insertTableTest("Product", product7);
        insertTableTest("Product", product8);
        insertTableTest("Product", product9);

        Category category0 = new Category(0, "Laptop");
        Category category1 = new Category(1, "Phụ kiện");
        Category category2 = new Category(2, "PC Gaming");
        Category category3 = new Category(3, "PC Văn Phòng");
        Category category4 = new Category(4, "Link kiện");
        Category category5 = new Category(5, "Tản nhiệt");
        Category category6 = new Category(6, "Màn hình");
        Category category7 = new Category(7, "Phím, Chuột, Ghế");
        Category category8 = new Category(8, "Máy chơi game");
        Category category9 = new Category(9, "Loa, Tai nghe");

        insertTableTest("Category", category0);
        insertTableTest("Category", category1);
        insertTableTest("Category", category2);
        insertTableTest("Category", category3);
        insertTableTest("Category", category4);
        insertTableTest("Category", category5);
        insertTableTest("Category", category6);
        insertTableTest("Category", category7);
        insertTableTest("Category", category8);
        insertTableTest("Category", category9);

        Accessory accessory0 = new Accessory(0, "HDMI Cable");
        Accessory accessory1 = new Accessory(1, "VGA Cable");
        Accessory accessory2 = new Accessory(2, "DVI Cable");
        Accessory accessory3 = new Accessory(3, "Type-C to HDMI Cable");
        Accessory accessory4 = new Accessory(4, "HDMI to VGA Cable");
        Accessory accessory5 = new Accessory(5, "HDMI to DVI Cable");
        Accessory accessory6 = new Accessory(6, "Bàn Laptop");
        Accessory accessory7 = new Accessory(7, "Giá đỡ Laptop");
        Accessory accessory8 = new Accessory(8, "Balo Laptop");
        Accessory accessory9 = new Accessory(9, "Docking");

        insertTableTest("Accessory", accessory0);
        insertTableTest("Accessory", accessory1);
        insertTableTest("Accessory", accessory2);
        insertTableTest("Accessory", accessory3);
        insertTableTest("Accessory", accessory4);
        insertTableTest("Accessory", accessory5);
        insertTableTest("Accessory", accessory6);
        insertTableTest("Accessory", accessory7);
        insertTableTest("Accessory", accessory8);
        insertTableTest("Accessory", accessory9);
    }

    public static void printTableTest(){
        Database.getInstants().printTable();
    }

    public int updateTableTest(int id, Object row) {
        return Database.getInstants().updateTableById(id, row);
    }

    public static void main(String[] args){

        DatabaseDemo.initDatabase();
        DatabaseDemo.printTableTest();
    }
}
