package logic;

import annotation.Resource;
import dataaccess.ItemDao;
import dataaccess.ItemDaoImpl;

import java.util.List;

public class ItemCatalogImpl implements ItemCatalog {

    @Resource(ItemDaoImpl.class)
    private ItemDao dao;

    public List<Item> getAll() {
        return dao.findAll();
    }

}
