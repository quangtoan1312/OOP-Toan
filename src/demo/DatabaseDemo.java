package demo;

import dao.Database;
import entity.Accessory;
import entity.Category;
import entity.Product;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DatabaseDemo {
    public int insertTableTest(String name, Object row) {
        return Database.insertTable(name, row);
    }

    public ArrayList selectTableTest(String name, String where) {
        return Database.selectTable(name, where);
    }

    public int updateTableTest(String name, Object row) {
        return Database.updateTable(name, row);
    }

    public boolean deleteTableTest(String name, Object row){
        return Database.deleteTable(name, row);
    }

    public void truncateTableTest(String name) {
        Database.truncateTable(name);
    }

    public void initDatabase(){
        Random random = new Random();
        for(int id = 0; id < 10; id++){
            String name = random.toString();
            int categoryId = random.nextInt();
            Product newProduct = new Product(id, name, categoryId);
            Database.insertTable("Product",newProduct);
        }

        for(int id = 0; id < 10; id++){
            String name = random.toString();
            Category newCategory = new Category(id, name);
            Database.insertTable("Product",newCategory);
        }

        for(int id = 0; id < 10; id++){
            String name = random.toString();
            Accessory newAccessory = new Accessory(id, name);
            Database.insertTable("Product",newAccessory);
        }
    }

    public void printTableTest(){
        Database.printTable();
    }

    public int updateTableTest(int id, Object row) {
        return Database.updateTableById(id, row);
    }
}
