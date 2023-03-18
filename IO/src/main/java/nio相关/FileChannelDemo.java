package nio相关;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {
    public static void main(String[] args) throws Exception {
        //读写demo
        readAndWrite();



    }

    public static void readAndWrite() throws Exception {
        RandomAccessFile raf = new RandomAccessFile(FileChannelDemo.class.getClassLoader().getResource("test.txt").getPath(), "rw");
        try (FileChannel fileChannel = raf.getChannel()) {
            ByteBuffer bb = ByteBuffer.allocate(1024);
            int byteRead = fileChannel.read(bb);
            while (byteRead != -1) {
                System.out.println("读取了：" + byteRead);
                bb.flip();
                while (bb.hasRemaining()) {
                    System.out.print((char) bb.get());
                }
                bb.clear();
                byteRead = fileChannel.read(bb);
            }

            String data = "new Data";
            bb.put(data.getBytes());
            bb.flip();
            while (bb.hasRemaining()){
                fileChannel.write(bb);
            }
        }
    }
}
