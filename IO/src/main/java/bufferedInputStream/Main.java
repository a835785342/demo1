package bufferedInputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try (FileInputStream fis = new FileInputStream("/Users/jiangyoushengcai/Downloads/WPS_Office_5.2.1(7798)_universal.dmg");
//             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/jiangyoushengcai/Downloads/WPS_Office_5.2.1(7798)_universal.dmg"));
//             FileOutputStream fos = new FileOutputStream("/Users/jiangyoushengcai/Downloads/WPS_Office_5.2.1(7798)_universal.dmg.fos");
//             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/jiangyoushengcai/Downloads/WPS_Office_5.2.1(7798)_universal.dmg.bos"))) {
//
//            long start = System.currentTimeMillis();
//            int data;
//            byte[] bytes1 = new byte[8192];
//            while ((bis.read(bytes1,0,bytes1.length)) != -1) {
//                bos.write(bytes1,0,bytes1.length);
//            }
//            System.out.println("缓存流耗时："+(System.currentTimeMillis() - start));
//
//            start = System.currentTimeMillis();
//            byte[] bytes = new byte[8192];
//            while ((data = fis.read(bytes)) != -1) {
//                fos.write(bytes,0,data);
//            }
//            System.out.println("字节流耗时："+(System.currentTimeMillis() - start));
//
//
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try (ByteArrayInputStream bais = new ByteArrayInputStream("1234567".getBytes())) {
            byte[] bytes2 = new byte[2];
            int data;
            while ((data = bais.read(bytes2)) != -1) {
                System.out.println(new String(bytes2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
