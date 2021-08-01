import java.io.*;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) throws IOException { // throws keyword
        File f = new File("abc.txt");
        if (f.createNewFile()) { // file created
            System.out.println(f.getName());
        }
        FileWriter fw = new FileWriter(f.getName());// file writing
        fw.write("Hello first time file handled in java");
        fw.close();
        // FileReader fr = new FileReader("abc.txt");// file reading
        // int s = fr.read();
        // System.out.println(s);
        // fr.close();
        FileReader fr = new FileReader("abc.txt");
        Scanner frs = new Scanner(f);
        while (frs.hasNext()) {
            String s = frs.nextLine();
            System.out.println(s);
        }
        frs.close();
        fr.close();
        if (f.delete()) { // file deleted
            System.out.println(f.getName());
        }
    }

}
