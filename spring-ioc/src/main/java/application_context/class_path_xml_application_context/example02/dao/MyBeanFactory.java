package application_context.class_path_xml_application_context.example02.dao;

public class MyBeanFactory {

    public LegacyOrderDao obtainDao() {
        return new LegacyOrderDao();
    }
}
