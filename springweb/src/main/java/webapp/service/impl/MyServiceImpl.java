package webapp.service.impl;

import org.springframework.stereotype.Service;
import webapp.annotation.MyAnnotation;
import webapp.service.MyService;

@Service
public class MyServiceImpl implements MyService {
    
    @MyAnnotation
    public void myMethodString(String a){
    }

    @MyAnnotation
    public void myMethodInt(Integer a){

    }
}
