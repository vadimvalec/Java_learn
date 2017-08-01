import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadingFromFile {


    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String fName = input.nextLine();

        String separator = File.separator;

        String fileName = "D:" + separator + "JavaLesons" + separator + "Java_learn" + separator + fName;


        System.out.println("Выбирите действие с файлом: W - запись; R - чтение; D - удаление.");

        String action = input.nextLine();


        if (action.equals("W") || action.equals("w") || action.equals("ц") || action.equals("Ц")) {
            addToFile(fileName);
            System.out.println("запись");

        }
        if (action.equals("R") || action.equals("r") || action.equals("к") || action.equals("К")) {
            readFromFile(fileName);
            System.out.println("чтение");
        }
        if (action.equals("D") || action.equals("d") || action.equals("в") || action.equals("В")) {
            deleteFile(fileName);
            System.out.println("удаление");
        }
    }

    private static void addToFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);

        fw.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");
        fw.close();
    }

    public static void readFromFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fr.close();
        scanner.close();

    }

    public static void deleteFile(String fileName) throws IOException {

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        file.deleteOnExit();
        scanner.close();

    }

}

