package entity;

public class Accessory extends BaseRow {
    public Accessory(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "Accessory@[ID: " + id + ", name: " + name + "]";
    }
}
