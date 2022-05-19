package demo;

import dao.CategoryDAO;
import entity.Category;

import java.util.ArrayList;

public class CategoryDaoDemo extends CategoryDAO {
    public int insertTest(Category row) {
        return super.insert(row);
    }

    public int updateTest(Category row){
        return super.update(row);
    }

    public boolean deleteTest(Category row) {
        return super.delete(row);
    }

    public ArrayList findAllTest(String name) {
        return super.findAll(name);
    }

    public Object findByIdTest(int id) {
        return super.findById(id);
    }
}
