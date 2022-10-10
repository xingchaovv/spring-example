package application_context.class_path_xml_application_context.example01.dao;

public class MyBeanFactory {

    public Order obtainDao() {
        return new Order();
    }
}
