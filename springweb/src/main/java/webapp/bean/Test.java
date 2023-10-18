package webapp.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Test implements InitializingBean {

//    public Test(){
//        System.out.println("构造函数");
//    }
    
//    public Test(String a){
//        System.out.println("a");
//    }
    
    public Test(AutowiredBean autowiredBean){
        System.out.println("a+b");
    }

    @PostConstruct
    public void init() {
        System.out.println("执行PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行InitializingBean");
    }
}
