package logic;

import dataaccess.ItemDao;

import java.util.ArrayList;
import java.util.List;

public class ItemCatalogImpl implements ItemCatalog {

    private ItemDao dao = ItemDao.getInstance();

    public List<Item> getAll() {
        return dao.findAll();
    }

}
