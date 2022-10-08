package bean_with_properties;

import lombok.ToString;

import java.util.Properties;

@ToString
public class MySystem {

    private Properties myProperties;

    public Properties getMyProperties() {
        return myProperties;
    }

    public void setMyProperties(Properties myProperties) {
        this.myProperties = myProperties;
    }
}
