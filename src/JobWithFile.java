import java.io.IOException;
import java.util.Scanner;


public class JobWithFile {


    public static void main(String[] args)  {

        WorkWithFile file = new WorkWithFile();

        Scanner input = new Scanner(System.in);

        String fName="";

        while(fName.equals("")==true) {
            System.out.println("Введите имя файла:");
            fName = input.nextLine();
            if (fName.equals("")) try {
                throw new IOException();
            } catch (IOException e) {
                // e.printStackTrace();

            }

        }


        String fileName = file.getFileName(fName); // создаем объект и задаем имя файла для работы


        System.out.println("Выбирите действие с файлом: W - запись; R - чтение; D - удаление.");

        String action = input.nextLine();


        if (action.equals("W") || action.equals("w") || action.equals("ц") || action.equals("Ц")) {
            // addToFile(fileName);
            try {
                file.addToFile(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        if (action.equals("R") || action.equals("r") || action.equals("к") || action.equals("К")) {
            try {
                file.readFromFile(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if (action.equals("D") || action.equals("d") || action.equals("в") || action.equals("В")) {
            try {
                file.deleteFile(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


}

