import java.io.FileWriter;
import java.io.*;
import java.util.TreeSet;


public class FileExample {
    public static void main(String [] args) throws IOException {


        TreeSet<String> tree=new TreeSet<>();
        tree.add(new String(String.valueOf(67)) );
        tree.add(new String(String.valueOf(45)));
        tree.add(new String(String.valueOf(23)));
        tree.add(new String(String.valueOf(36)));
        System.out.println(tree);


    }
}
