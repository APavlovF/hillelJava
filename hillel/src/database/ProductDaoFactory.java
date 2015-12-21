package database;

/**
 * Created by APavlov on 21.12.2015.
 */
public class ProductDaoFactory {
    public static ProductDAO createDao(String daoType) {
        ProductDAO productDAO;
        switch (daoType) {
            case "db":
                productDAO = new ProductDbDAO();
                break;
            case "memory":
                productDAO = new ProductMemoryDAO();
                break;
            case "xml":
                productDAO = new ProductXmlDao();
                break;
            default:
                //throw new RuntimeException();
                System.out.println("expected: db, memory or xml, but found: " + daoType);
                productDAO = new ProductMemoryDAO();
        }
        return productDAO;
    }
}
