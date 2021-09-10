package dao;

public class DaoFactory {

    // ProductsDao is a list
    private static ProductsInterface productsDao;

    public static ProductsInterface getProductsDao(){

        // Check to see if a products Data access object already exists
        if (productsDao == null){
            // If the productsDao is null its because it hasnt been
            // initialized, so we need to initialize it
            productsDao = new ListProductsDao();
        }
        return productsDao;
    }

}
