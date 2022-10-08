package bean_instantiate.dao;

public class LegacyOrderDaoFactory {

    private static LegacyOrderDao legacyOrderDao = new LegacyOrderDao();

    public static LegacyOrderDao obtainDao() {
        return legacyOrderDao;
    }
}
