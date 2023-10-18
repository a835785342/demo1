package webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import webapp.bean.AutowiredBean;

@Configuration
public class AppConfig {

    @Bean
    public AutowiredBean autowiredBean1() {
        AutowiredBean autowiredBean = new AutowiredBean();
        autowiredBean.setName("autowiredBean1");
        return autowiredBean;
    }

    @Bean
    public AutowiredBean autowiredBean2() {
        AutowiredBean autowiredBean = new AutowiredBean();
        autowiredBean.setName("autowiredBean2");
        return autowiredBean;
    }
}
