package dataaccess;

import logic.Item;

import java.util.List;

public interface ItemDao {
    public static ItemDao getInstance() {
        return new ItemDaoImpl();
    }
    public List<Item> findAll();
}
