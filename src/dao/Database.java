package dao;

import entity.Accessory;
import entity.Category;
import entity.Product;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Product> productTable;
    private static ArrayList<Category> categoryTable;
    private static ArrayList<Accessory> accessoryTable;
    private static Database instants;

    public static Database getInstance(){
        if(instants == null){
            return instants = new Database();
        }
        return instants;
    }

    public static int insertTable(String name, Object row){
        if(row.getClass().getName().equalsIgnoreCase("product")){
            productTable.add((Product) row);
            return 1;
        }

        if(row.getClass().getName().equalsIgnoreCase("category")){
            categoryTable.add((Category) row);
            return 1;
        }

        if(row.getClass().getName().equalsIgnoreCase("accessory")){
            accessoryTable.add((Accessory) row);
            return 1;
        }
        return 0;
    }

    public static ArrayList selectTable(String name, String where){
        if (name.equalsIgnoreCase("product"))
            return productTable;
        if (name.equalsIgnoreCase("category"))
            return categoryTable;
        if (name.equalsIgnoreCase("accessory"))
            return accessoryTable;
        return null;
    }

    public static int updateTable(String name, Object row){
        if (row == null){
            return 0;
        }

        if (name.equalsIgnoreCase("product")){
            Product rowProduct = (Product) row;
            for (int i = 0; i < productTable.size(); i++){
                if (productTable.get(i).getId() == rowProduct.getId()){
                    productTable.set(i, rowProduct);
                }
            }
            return 1;
        }

        if (name.equalsIgnoreCase("category")){
            Category rowCategory = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++){
                if (categoryTable.get(i).getId() == rowCategory.getId()){
                    categoryTable.set(i, rowCategory);
                }
            }
            return 1;
        }

        if (name.equalsIgnoreCase("accessory")){
            Accessory rowAccessory = (Accessory) row;
            for (int i = 0; i < accessoryTable.size(); i++){
                if (accessoryTable.get(i).getId() == rowAccessory.getId()){
                    accessoryTable.set(i, rowAccessory);
                }
            }
            return 1;
        }

        return 0;
    }

    public static boolean deleteTable(String name, Object row){
        if (row == null)
            return false;

        if (name.equalsIgnoreCase("product")){
            Product rowProduct = (Product) row;
            for (int i = 0; i < productTable.size(); i++){
                if (productTable.get(i).getId() == rowProduct.getId()){
                    productTable.remove(i);
                }
            }
            return true;
        }

        if (name.equalsIgnoreCase("category")){
            Category rowCategory = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++){
                if (categoryTable.get(i).getId() == rowCategory.getId()){
                    categoryTable.remove(i);
                }
            }
            return true;
        }

        if (name.equalsIgnoreCase("accessory")){
            Accessory rowAccessory = (Accessory) row;
            for (int i = 0; i < accessoryTable.size(); i++){
                if (accessoryTable.get(i).getId() == rowAccessory.getId()){
                    accessoryTable.remove(i);
                }
            }
            return true;
        }

        return false;
    }

    public static void truncateTable(String name){
        boolean check = false;
        while (!check){
            if (name.equalsIgnoreCase("product")) {
                productTable.removeAll(productTable);
                check = true;
            }


            if(name.equalsIgnoreCase("category")) {
                categoryTable.removeAll(categoryTable);
                check = true;
            }

            if(name.equalsIgnoreCase("accessory")) {
                accessoryTable.removeAll(accessoryTable);
                check = true;
            }
        }
    }

    public static void printTable(){
        System.out.println(productTable);
        System.out.println(categoryTable);
        System.out.println(accessoryTable);
    }

    public static int updateTableById(int id, Object row){
        if (row.getClass().getName().equalsIgnoreCase("product")){
            Product rowProduct = (Product) row;
            for (int i = 0; i < productTable.size(); i++){
                if (productTable.get(i).getId() == id){
                    productTable.set(i, rowProduct);
                }
            }
            return 1;
        }

        if (row.getClass().getName().equalsIgnoreCase("category")){
            Category rowCategory = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++){
                if (categoryTable.get(i).getId() == id){
                    categoryTable.set(i, rowCategory);
                }
            }
            return 1;
        }

        if (row.getClass().getName().equalsIgnoreCase("accessory")){
            Accessory rowAccessory = (Accessory) row;
            for (int i = 0; i < accessoryTable.size(); i++){
                if (accessoryTable.get(i).getId() == id){
                    accessoryTable.set(i, rowAccessory);
                }
            }
            return 1;
        }

        return 0;
    }
}
