import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("example3.txt"));
            bw.write("Buffered Writer writes fast!");
            bw.close();
            System.out.println("Written using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
