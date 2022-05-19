package entity;

public class Product extends BaseRow{
    private int categoryId;

    public Product(int id, String name, int categoryId){
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
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
