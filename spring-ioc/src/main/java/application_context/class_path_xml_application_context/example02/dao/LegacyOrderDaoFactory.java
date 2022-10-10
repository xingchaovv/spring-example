package application_context.class_path_xml_application_context.example02.dao;

public class LegacyOrderDaoFactory {

    private static LegacyOrderDao legacyOrderDao = new LegacyOrderDao();

    public static LegacyOrderDao obtainDao() {
        return legacyOrderDao;
    }
}
