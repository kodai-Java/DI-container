package logic;

public class Item {

    private int id;
    private String name;
    private int price;

    public Item(int id,String name, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
