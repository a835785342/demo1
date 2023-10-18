package webapp.bean;

import org.springframework.stereotype.Component;

@Component
public class AutowiredBean {
    
    private String name;
    
    private Object a;
    
    private Double b;
    
    public AutowiredBean(){
        this.name = "autowiredBean";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }
}
