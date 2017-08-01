import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFile {

    public String getFileName(String fName) {


        String separator = File.separator;

        String fileName = "D:" + separator + "JavaLesons" + separator + "Java_learn" + separator + fName;
        return fileName;
    }


    public void addToFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);

        fw.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");
        fw.close();
    }

    public void readFromFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fr.close();
        scanner.close();

    }

    public void deleteFile(String fileName) throws IOException {

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        file.deleteOnExit();
        scanner.close();

    }


}
