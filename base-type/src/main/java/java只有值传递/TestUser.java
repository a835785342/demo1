package java只有值传递;

class User {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestUser {
    public static void main(String[] args) {
        User user = new User(18, "zhangsan");
        System.out.println("修改对象前:"+user);
        changeUser(user);
        System.out.println("修改对象后:"+user);
    }

    private static void changeUser(User user) {
        user = new User();
        user.setAge(20);
        user.setName("lisi");
    }
}
