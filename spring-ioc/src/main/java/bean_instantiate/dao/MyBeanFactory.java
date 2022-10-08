package bean_instantiate.dao;

public class MyBeanFactory {

    public LegacyOrderDao obtainDao() {
        return new LegacyOrderDao();
    }
}
