package bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try (InputStream ai = new ByteArrayInputStream("1234567890".getBytes());
             InputStream bis = new BufferedInputStream(ai, 4)) {

            System.out.println("Char : " + (char) bis.read());    //step:1
            System.out.println("Char : " + (char) bis.read());    //step:2

            bis.mark(3);                                          //step:3
            System.out.println("-------mark(3)----------");

            System.out.println("Char : " + (char) bis.read());    //step:4
            System.out.println("Char : " + (char) bis.read());    //step:5
            System.out.println("Char : " + (char) bis.read());    //step:6
            System.out.println("Char : " + (char) bis.read());    //step:6

            bis.reset();                                          //step:7
            System.out.println("-------reset()----------");

            int b;
            while ((b = bis.read()) != -1) {
                System.out.println("char : " + (char) b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
