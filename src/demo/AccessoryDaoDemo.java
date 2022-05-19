package demo;

import dao.AccessoryDAO;
import entity.Accessory;

import java.util.ArrayList;

public class AccessoryDaoDemo extends AccessoryDAO {
    public int insertTest(Accessory row) {
        return insert(row);
    }

    public int updateTest(Accessory row) {
        return update(row);
    }

    public boolean deleteTest(Accessory row) {
        return delete(row);
    }

    public ArrayList findAllTest(String name) {
        return findAll(name);
    }

    public Object findByIdTest(int id){
        return findById(id);
    }

    public ArrayList searchTest(Object where){
        return search(where);
    }
}
