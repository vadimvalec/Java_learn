import java.io.IOException;
import java.util.Scanner;


public class JobWithFile {


    public static void main(String[] args) throws IOException {

        WorkWithFile file = new WorkWithFile();

        Scanner input = new Scanner(System.in);

        System.out.println("Введите имя файла:");
        String fName = input.nextLine();

        String fileName = file.getFileName(fName);


        System.out.println("Выбирите действие с файлом: W - запись; R - чтение; D - удаление.");

        String action = input.nextLine();


        if (action.equals("W") || action.equals("w") || action.equals("ц") || action.equals("Ц")) {
            // addToFile(fileName);
            file.addToFile(fileName);
            System.out.println("запись");

        }
        if (action.equals("R") || action.equals("r") || action.equals("к") || action.equals("К")) {
            file.readFromFile(fileName);
            System.out.println("чтение");
        }
        if (action.equals("D") || action.equals("d") || action.equals("в") || action.equals("В")) {
            file.deleteFile(fileName);
            System.out.println("удаление");
        }
    }


}

