import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "D:" + separator + "JavaLesons" + separator + "Java_learn"+separator+"text.txt";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        System.out.println(path);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
