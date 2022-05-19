package dao;

import entity.Accessory;
import entity.Product;
import java.util.ArrayList;

public class AccessoryDAO extends BaseDAO{
    /**
     * Find accessory with input name
     * @param name
     * @return accessory with corresponding name
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

