package entity;

public class Product {
    protected int id;
    protected String name;
    protected int categoryId;

    public Product(int id, String name, int categoryId){
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String toString(){
        return "Product@[ID: " + id + ", name: " + name + ", Category ID: " + categoryId + "]";
    }
}
