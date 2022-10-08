package init_method;

import lombok.ToString;

@ToString
public class Order {

    public static Integer num = 0;

    {
        num++;
        System.out.printf("In init method of Order-%d.\n", num);
    }
    public String name = "Order-" + num;

    public void showName() {
        System.out.println("Name of Order: " + name);
    }

    public void sayBye() {
        System.out.println("Bye!");
    }
}
