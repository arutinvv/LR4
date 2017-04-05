/**
 * Created by House on 06.04.2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        HillelFileWriter writer = new HillelFileWriter();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        String content;

        System.out.println("Please input a path and file name: ");
        path = reader.readLine();
        System.out.println("Please input a content: ");
        content = reader.readLine();

        writer.writeToFile(path, content);
    }
}
