package demo;

import dao.AccessoryDAO;
import dao.IDao;
import entity.Accessory;

import java.util.ArrayList;

public class AccessoryDaoDemo {
    AccessoryDAO accessoryDAO = new AccessoryDAO();
    public int insertTest(Accessory row) {
        return accessoryDAO.insert(row);
    }

    public int updateTest(Accessory row) {
        return accessoryDAO.update(row);
    }

    public boolean deleteTest(Accessory row) {
        return accessoryDAO.delete(row);
    }

    public ArrayList findAllTest(String name) {
        return accessoryDAO.findAll(name);
    }

    public Object findByIdTest(int id){
        return accessoryDAO.findById(id);
    }

    public ArrayList searchTest(Object where){
        return accessoryDAO.search(where);
    }
}
