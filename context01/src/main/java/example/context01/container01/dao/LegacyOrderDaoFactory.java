package example.context01.container01.dao;

public class LegacyOrderDaoFactory {

    private static LegacyOrderDao legacyOrderDao = new LegacyOrderDao();

    public static LegacyOrderDao obtainDao() {
        return legacyOrderDao;
    }
}
