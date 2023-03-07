package 装饰者模式;

import java.io.*;

public class InputStream示例 {
    public static void main(String[] args) throws Exception {

        ByteArrayInputStream bais = new ByteArrayInputStream("1234567".getBytes());
        InputStream is = new BufferedInputStream(bais);
        is = new DataInputStream(is);

        is.read();
    }
}
