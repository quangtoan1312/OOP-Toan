package dao;

import com.sun.rowset.internal.BaseRow;
import entity.Accessory;
import entity.Category;
import entity.Product;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Product> productTable = new ArrayList<>();
    private static ArrayList<Category> categoryTable = new ArrayList<>();
    private static ArrayList<Accessory> accessoryTable = new ArrayList<>();
    private static Database instants;
    public Database(){}

    public static Database getInstants(){ //1 object duy nhat
        if (instants == null){
            instants = new Database();
        }
        return instants;
    }

    public static void setProductTable(ArrayList<Product> productTable) {
        Database.productTable = productTable;
    }

    public static void setCategoryTable(ArrayList<Category> categoryTable) {
        Database.categoryTable = categoryTable;
    }

    public static void setAccessoryTable(ArrayList<Accessory> accessoryTable) {
        Database.accessoryTable = accessoryTable;
    }

    public static ArrayList<Product> getProductTable() {
        return productTable;
    }

    public static ArrayList<Category> getCategoryTable() {
        return categoryTable;
    }

    public static ArrayList<Accessory> getAccessoryTable() {
        return accessoryTable;
    }

    /**
     * Insert input data to table if right name
     * @param name, row
     * @return number of row
     */
    public static int insertTable(String name, Object row){
        if(row.getClass().getName().equalsIgnoreCase(Product.class.getName())){
            productTable.add((Product) row);
            return 1;
        }

        if(row.getClass().getName().equalsIgnoreCase(Category.class.getName())){
            categoryTable.add((Category) row);
            return 1;
        }

        if(row.getClass().getName().equalsIgnoreCase(Accessory.class.getName())){
            accessoryTable.add((Accessory) row);
            return 1;
        }
        return 0;
    }

    /**
     * Select table
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

    /**
     * Update table with input name
     * @param name, row
     * @return number of row
     */
    public static int updateTable(String name, Object row){
        if (row == null){
            return 0;
        }

        if (name.equalsIgnoreCase("Product")){
            Product rowProduct = (Product) row;
            for (int i = 0; i < productTable.size(); i++){
                if (rowProduct.getId() == productTable.get(i).getId()){
                    productTable.set(i, rowProduct);
                }
            }
            return 1;
        }

        if (name.equalsIgnoreCase("Category")){
            Category rowCategory = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++){
                if (categoryTable.get(i).getId() == rowCategory.getId()){
                    categoryTable.set(i, rowCategory);
                }
            }
            return 1;
        }

        if (name.equalsIgnoreCase("Accessory")){
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
                if (Database.getProductTable().get(i).getId() == rowProduct.getId()){
                    Database.getProductTable().remove(i);
                }
            }
            return true;
        }

        if (name.equalsIgnoreCase("category")){
            Category rowCategory = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++){
                if (Database.getCategoryTable().get(i).getId() == rowCategory.getId()){
                    Database.getCategoryTable().remove(i);
                }
            }
            return true;
        }

        if (name.equalsIgnoreCase("accessory")){
            Accessory rowAccessory = (Accessory) row;
            for (int i = 0; i < accessoryTable.size(); i++){
                if (Database.getAccessoryTable().get(i).getId() == rowAccessory.getId()){
                    Database.getAccessoryTable().remove(i);
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
                Database.getProductTable().removeAll(Database.productTable);
                check = true;
            }


            if(name.equalsIgnoreCase("category")) {
                Database.getCategoryTable().removeAll(categoryTable);
                check = true;
            }

            if(name.equalsIgnoreCase("accessory")) {
                Database.getAccessoryTable().removeAll(accessoryTable);
                check = true;
            }
        }
    }

    /** Print all table
     *
     */
    public static void printTable(){
        ArrayList<Product> newProduct = productTable;
        for (Product product: newProduct){
            System.out.println(product.toString());
        }
        ArrayList<Category> newCategory = categoryTable;
        for (Category category: newCategory){
            System.out.println(category.toString());
        }
        ArrayList<Accessory> newAccessory = accessoryTable;
        for (Accessory accessory: newAccessory){
            System.out.println(accessory.toString());
        }
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
