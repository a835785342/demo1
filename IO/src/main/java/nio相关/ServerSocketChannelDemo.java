package nio相关;

import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo {
    public static void main(String[] args) throws Exception {
        int port = 8888;

        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.bind(new InetSocketAddress(port));
        ssc.configureBlocking(false);

        while (true) {
            System.out.println("waiting for connect");
            try (SocketChannel sc = ssc.accept()) {
                if (sc == null) {
                    System.out.println("null");
                    Thread.sleep(2000);
                } else {
                    System.out.println(sc.socket().getRemoteSocketAddress());
                }
            }
        }
    }
}
