package nio相关.客户端nio服务端bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket()) {
            socket.setSoTimeout(5000);
            socket.connect(new InetSocketAddress("127.0.0.1", 8080));
            InputStream is = socket.getInputStream();
            byte[] buff = new byte[1024];
            int len;
            while ((len=is.read(buff)) != -1) {
                System.out.println("服务器返回的数据：" + new String(buff,0,len));
            }
            System.out.println("服务器断开了");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
