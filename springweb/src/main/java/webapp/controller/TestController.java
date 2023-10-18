package webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.service.impl.MyServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RestController
public class TestController {
    
    @Autowired
    private ApplicationContext applicationContext;
    
    @Autowired
    private MyServiceImpl myService;

    @GetMapping(value = "/test")
    public String test(HttpServletRequest request) throws Exception {
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
        myService.myMethodString("test");
        throw new RuntimeException("fail");
        
    }
}
