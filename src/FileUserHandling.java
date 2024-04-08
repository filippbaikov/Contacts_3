import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class FileUserHandling {
    AppendUser appendUser = new AppendUser();


    public void appendUserToFile(User user) throws IOException {
        String file = user.getLastname() + ".txt";
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(user + "\n");


        }
    }

    public void readUserFromFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи фамилию");
        String file = scanner.next();
        try (FileReader reader = new FileReader(file + ".txt")) {
            char[] buf = new char[100];
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 100) {
                    buf = Arrays.copyOf(buf, c);
                    System.out.println(buf);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("нет такого файла");
        }
    }


    public void runFileHandling() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выбери действие: записать в файл- 1, прочитать из файла- 2");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                try {
                    User user = appendUser.inputUserInfo();
                    appendUserToFile(user);
                } catch (DataFormatException e) {
                    throw new RuntimeException(e);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                readUserFromFile();
                break;
        }

    }

}

