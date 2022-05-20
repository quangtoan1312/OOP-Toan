package entity;

abstract class BaseRow implements IEntity {
    protected int id;
    protected String name;

    @Override
    public int getId(){
        return id;
    }

    @Override
    public void setId(int id){
        this.id=id;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }
}
