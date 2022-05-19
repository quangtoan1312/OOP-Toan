package dao;

import entity.Category;
import entity.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProductDAO extends BaseDAO{
    /**
     * Find product with input name
     * @param name
     * @return product with corresponding name
     */
    public static Object findByName(String name){
        return Database.findByName(name);
    }

    /**
     * Search list from object
     * @param where
     * @return
     */
    public static ArrayList search(Object where){
        return Database.search(where);
    }

}

