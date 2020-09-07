import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExplorer {
    private static StringBuilder logging = new StringBuilder();

    public void createDirectory(String path) {
        File directory = new File(path);
        if (directory.mkdir()) {
            logging.append("Каталог " + path + " успешно создан!").append('\n');
        }
    }

    public void createFile(String path) {
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                logging.append("Файл " + path + " успешно создан!").append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeLogToFile(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(logging.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
