package scq1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("core1.xml");

        // using the setter injection
        Customer customer1=(Customer) context.getBean("customer1");
        customer1.customerDetail();

        // using constructor injection
        Customer customer2=(Customer) context.getBean("customer2");
        customer2.customerDetail();

    }
}