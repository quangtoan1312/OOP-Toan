package entity;

public class Category extends BaseRow {
    public Category(int id, String name){
        this.id=id;
        this.name = name;
    }

    public String toString(){
        return "Category@[ID: " + id + ", name: " + name + "]";
    }
}
