package logic;

public interface ItemCatalog {
    public static ItemCatalog getInstance(){
        return new ItemCatalogImpl();
    }
}
