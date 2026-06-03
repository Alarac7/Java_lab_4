import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    static void main() {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("source.txt");
            out = new FileOutputStream("dest.txt");
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
            System.out.println("Копирование завершено");

        } catch (IOException e) {
            System.out.println("Error: ошибка при работе с файлами: " + e.getMessage());

        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e) {
                System.out.println("Не удалось закрыть входящий поток");
            }

            try {
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Не удалось закрыть исходящий поток");
            }
        }
    }
}
