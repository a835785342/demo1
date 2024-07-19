package webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import webapp.bean.UserBean;

//@SpringBootApplication
public class SpringWebApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserBean user = (UserBean) applicationContext.getBean("userBean");
        String a = "123";
        a = a.intern();
        ((AbstractApplicationContext) applicationContext).close();
    }
}
