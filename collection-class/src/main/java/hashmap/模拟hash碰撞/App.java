package hashmap.模拟hash碰撞;

import java.util.Objects;

public class App {

    private int id;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        App app = (App) o;
//        return id == app.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
