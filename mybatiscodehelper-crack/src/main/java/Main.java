import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class Main {
    public static void main(String[] args) throws Exception{
        // 获取 Jar 包
        ClassPool classPool = ClassPool.getDefault();
        classPool.insertClassPath("/Users/jiangyoushengcai/Library/CloudStorage/OneDrive-个人/demo1/mybatiscodehelper-crack/src/libs/MyBatisCodeHelper-Pro-obfuss.jar");
        // 参数为jar包里的 .class 文件全类名，对应要修改的方法的类
        CtClass c2 = classPool.getCtClass("com.ccnode.codegenerator.f.c.d");
        // set有参方法
        CtMethod setMethod = c2.getDeclaredMethod("a", new CtClass[]{classPool.getCtClass("java.lang.Long")});
        StringBuilder builder1 = new StringBuilder();
        builder1.append("{")
                .append("        this.d = new Long(4797976044000L);")
                .append("}");
        setMethod.setBody(builder1.toString());
        // get无参方法
        CtMethod getMethod = c2.getDeclaredMethod("b");
        StringBuilder builder = new StringBuilder();
        builder.append("{")
                .append("       return new Long(4797976044000L);")
                .append("}");
        getMethod.setBody(builder.toString());

        // set有参方法
        CtMethod setBooleanMethod = c2.getDeclaredMethod("a", new CtClass[]{classPool.getCtClass("java.lang.Boolean")});
        String setValidMethodBuilder = "{" +
                "this.c=Boolean.TRUE;" +
                "}";
        setBooleanMethod.setBody(setValidMethodBuilder);
        // get无参方法
        CtMethod getBooleanMethod = c2.getDeclaredMethod("c");
        String getValidMethodBuilder = "{" +
                "       return Boolean.TRUE;" +
                "}";
        getBooleanMethod.setBody(getValidMethodBuilder);
        
        c2.writeFile();
    }
}
