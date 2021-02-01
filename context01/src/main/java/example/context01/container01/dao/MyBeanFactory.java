package example.context01.container01.dao;

public class MyBeanFactory {

    public LegacyOrderDao obtainDao() {
        return new LegacyOrderDao();
    }
}
