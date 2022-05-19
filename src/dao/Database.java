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

    /** Insert input data to table if right name
     *
     * @param name, row
     * @return number of row
     */
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

    /** Chọn bảng có tên trùng tên nhập vào
     *
     * @param name
     * @return table
     */
    public static ArrayList selectTable(String name){
        if (name.equalsIgnoreCase("product"))
            return productTable;
        if (name.equalsIgnoreCase("category"))
            return categoryTable;
        if (name.equalsIgnoreCase("accessory"))
            return accessoryTable;
        return null;
    }

    /** Update table with input name
     *
     * @param name, row
     * @return number of row
     */
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

    /** Delete table with input name
     *
     * @param name, row
     * @return true
     */
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

    /** Delete all database
     *
     * @param name
     */
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

    /** Print all table
     *
     */
    public static void printTable(){
        System.out.println(productTable);
        System.out.println(categoryTable);
        System.out.println(accessoryTable);
    }

    /** Update table by id with input id
     *
     * @param id, row
     * @return number of updated row
     */
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

    /**
     * Find all tables with input name
     * @param name
     * @return corresponding table
     */
    public static ArrayList findAll(String name){
        if (name.equalsIgnoreCase("Product")){
            return productTable;
        }
        if (name.equalsIgnoreCase("Category")){
            return categoryTable;
        }
        if (name.equalsIgnoreCase("Accessory")){
            return accessoryTable;
        }
        return null;
    }

    /**
     * Find object with input id
     * @param id
     * @return corresponding object
     */
    public static Object findById(int id){
        for (Product product : productTable) {
            if (product.getId() == id) {
                return product;
            }
        }

        for (Category category : categoryTable) {
            if (category.getId() == id) {
                return category;
            }
        }

        for (Accessory accessory : accessoryTable) {
            if (accessory.getId() == id) {
                return accessory;
            }
        }

        return null;
    }

    public static Object findByName(String name){
        for (Product product: productTable){
            if (product.getName().equalsIgnoreCase(name))
                return product;
        }

        for (Category category: categoryTable){
            if (category.getName().equalsIgnoreCase(name))
                return category;
        }

        for (Accessory accessory: accessoryTable){
            if (accessory.getName().equalsIgnoreCase(name))
                return accessory;
        }

        return null;
    }

    /**
     * Search arraylist with object
     * @param where
     * @return corresponding arraylist
     */
    public static ArrayList search(Object where){
        for(int i = 0; i < productTable.size(); i++){
            if (productTable.get(i) == where){
                return productTable;
            }
        }

        for(int i = 0; i < categoryTable.size(); i++){
            if (categoryTable.get(i) == where){
                return categoryTable;
            }
        }

        for(int i = 0; i < accessoryTable.size(); i++){
            if (accessoryTable.get(i) == where){
                return accessoryTable;
            }
        }

        return null;
    }


}
