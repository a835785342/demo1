package webapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("@annotation(webapp.annotation.MyAnnotation)")
    public void addAdvice() {
    }
    
    @AfterThrowing(value = "addAdvice()",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex){
        System.out.println("切面输出报错信息");
    }
    
}
