package presentation;

import core.Container;
import logic.Item;
import logic.ItemCatalog;
import logic.ItemCatalogImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
//        ItemCatalog catalog = ItemCatalog.getInstance();

        Container con = new Container();
        ItemCatalog catalog = (ItemCatalog) con.getInstance(ItemCatalogImpl.class);
        List<Item> items = catalog.getAll();

        for (Item item: items) {
            System.out.println(item.getName());
        }
    }
}
