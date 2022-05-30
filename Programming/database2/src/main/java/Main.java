import database.DatabaseHandler;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        DatabaseHandler handler=new DatabaseHandler();
        String folderPath = "C:\\Users\\2369634\\Documents\\GitHub\\Programming\\Programming\\Fibonacci";
        String directoryName = "Fibonacci";
        handler.createTable(directoryName);
        File folder = new File(folderPath);
        Collection<File> files = FileUtils.listFiles(folder, null, true);
        for (File file : files) {
            System.out.println(file);
        }
    }
}
