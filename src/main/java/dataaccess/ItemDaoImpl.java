package dataaccess;

import logic.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    public List<Item> findAll() {
        List<Item> list = new ArrayList<Item>();
        list.add(new Item(100, "orange", 100));
        list.add(new Item(101, "banana", 80));
        list.add(new Item(102, "apple", 120));
        return list;
    }
}
