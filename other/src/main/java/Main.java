import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void modifyObject(StringBuilder sb) {
        sb.append(" world"); // Modifies the original StringBuilder object by appending " world"
        sb = new StringBuilder("hello"); // Points sb to a new StringBuilder object, but does not affect the original object passed
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello"); // Create a StringBuilder object
        modifyObject(str); // Pass the StringBuilder to the modifyObject method
        System.out.println(str); // Outputs the modified StringBuilder
    }
}
