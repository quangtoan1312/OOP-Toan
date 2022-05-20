package dao;

import java.util.ArrayList;

abstract class BaseDAO implements IDao{
    /**
     * Insert new object to database
     * @param row
     * @return number of row
     */
    public int insert(Object row){

        if (row.getClass().getName().equalsIgnoreCase("Product")){
            Database.insertTable("Product",row);
            return 1;
        }

        if (row.getClass().getName().equalsIgnoreCase("Category")){
            Database.insertTable("Category",row);
            return 1;
        }

        if (row.getClass().getName().equalsIgnoreCase("Accessory")){
            Database.insertTable("Accessory",row);
            return 1;
        }

        return 0;
    }

    /**
     * Update new object to database
     * @param row
     * @return number of row
     */
    public int update(Object row){
        if (row.getClass().getName().equalsIgnoreCase("Product")){
            Database.updateTable("Product", row);
            return 1;
        }

        if (row.getClass().getName().equalsIgnoreCase("Category")){
            Database.updateTable("Accessory", row);
            return 1;
        }
        if (row.getClass().getName().equalsIgnoreCase("Accessory")){
            Database.updateTable("Accessory", row);
            return 1;
        }

        return 0;
    }

    /**
     * Delete object from database with input
     * @param row
     * @return true
     */
    public boolean delete(Object row){
        if (row.getClass().getName().equalsIgnoreCase("Product")){
            Database.deleteTable("Product", row);
            return true;
        }

        if (row.getClass().getName().equalsIgnoreCase("Category")){
            Database.deleteTable("Category", row);
            return true;
        }

        if (row.getClass().getName().equalsIgnoreCase("Accessory")){
            Database.deleteTable("Accessory", row);
            return true;
        }

        return false;
    }

    /**
     * Find full object list with input name
     * @param name
     * @return object list
     */
    public ArrayList<String> findAll(String name){
        if (name.equalsIgnoreCase("Product")){
            return Database.findAll(name);
        }

        if (name.equalsIgnoreCase("Category")){
            return Database.findAll(name);
        }

        if (name.equalsIgnoreCase("Accessory")){
            return Database.findAll(name);
        }

        return null;
    }

    /**
     * Find category with input id
     * @param id
     * @return category
     */
    public Object findById(int id){
        Object newCategory = Database.findById(id);
        return newCategory;
    }
}
