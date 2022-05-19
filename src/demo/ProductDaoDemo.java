package demo;

import dao.ProductDAO;
import entity.Product;

import java.util.ArrayList;

public class ProductDaoDemo extends ProductDAO {
    public int insertTest(Product row) {
        return super.insert(row);
    }

    public int updateTest(Product row) {
        return super.update(row);
    }

    public boolean deleteTest(Product row) {
        return super.delete(row);
    }

    public ArrayList findAllTest() {
        return super.findAll();
    }

    public Object findByIdTest(int id){
        return findById(id);
    }

    public Object findByNameTest(String name){
        return findByName(name);
    }
}
