package demo;

import dao.ProductDAO;
import entity.Product;

import java.util.ArrayList;

public class ProductDaoDemo {
    static ProductDAO productDAO = new ProductDAO();
    public int insertTest(Product row) {
        return productDAO.insert(row);
    }

    public int updateTest(Product row) {
        return productDAO.update(row);
    }

    public boolean deleteTest(Product row) {
        return productDAO.delete(row);
    }

    public static ArrayList findAllTest() {
        return productDAO.findAll("Product");
    }

    public Product findByIdTest(int id){
        return (Product) productDAO.findById(id);
    }

    public Object findByNameTest(String name){
        return productDAO.findByName(name);
    }
}
