import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");



        List<Composite> children = Arrays.asList(new Basket());

        Basket warehouse = Basket.getInstance();




        warehouse.add(SellBuilder.getSell(SellType.SERVICE,"hair", 1, 23));
        warehouse.add(SellBuilder.getSell(SellType.PRODUCT,"lipstick", 2, 100));

        Clients user1 = context.getBean("user1", Clients.class);
        Clients user2 = context.getBean("user2", Clients.class);
        Clients user3 = context.getBean("user3", Clients.class);
        Clients user4 = context.getBean("user4", Clients.class);

        warehouse.giveSell(2, user1);
        warehouse.giveSell(2, user2);
        warehouse.giveSell(1, user4);
        warehouse.giveSell(1, user2);



        System.out.println("User1's basket:");
        user1.printSells();
        System.out.println("User2's basket:");
        user2.printSells();
        System.out.println("User3's basket:");
        user3.printSells();
        System.out.println("User4's basket:");
        user4.printSells();

    }
}
