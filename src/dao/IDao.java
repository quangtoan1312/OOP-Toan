package dao;

import java.util.ArrayList;

public interface IDao {
    int insert(Object row);
    int update(Object row);
    boolean delete(Object row);
    ArrayList<String> findAll(String name);
    Object findById(int id);
}
