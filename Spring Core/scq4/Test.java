package scq4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core4.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");


        System.out.println(controller.getBalance(1001));
        System.out.println(controller.deposit(1001,5000));
        System.out.println("==================================================");
        System.out.println(controller.withdraw(1001,5000));
        System.out.println("==================================================");
        System.out.println(controller.fundTransfer(1001,1002,5000));
        System.out.println(controller.getBalance(1001));
        System.out.println(controller.getBalance(1002));


    }
}