package webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String test(HttpServletRequest request) throws Exception {
        System.out.println(Thread.currentThread().getName() + "开始" + request.getRemotePort());
        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName() + "结束" + request.getRemotePort());
        return "ok";
    }
}
