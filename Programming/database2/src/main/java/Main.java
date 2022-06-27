import database.DatabaseHandler;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;


public class Main {
    private static DatabaseHandler handler;
    private static void printTable(String tableName) {
        String qu = "SELECT * FROM " + tableName;
        ResultSet resultSet = handler.execQuery(qu);
        try{
            while (resultSet.next()){
                String path = resultSet.getString("path");
                String name = resultSet.getString("name");
                String extension = resultSet.getString("extension");
                String size = resultSet.getString("size");
                System.out.println(path + " " + name + " " + extension + " " + size);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addTable(String folderPath) {
        String directoryName = parseName(folderPath);
        handler.createTable(directoryName);
        File folder = new File(folderPath);
        try{
            FileUtils.forceMkdir(new File(folderPath));
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        Collection<File> files = FileUtils.listFiles(folder, null, true);
        String st2 = "INSERT INTO FOLDERS VALUES ('"+ directoryName + "')";
        handler.execAction(st2);
        for (File file : files) {
            System.out.println(file);
            Path path = Paths.get(file.getAbsolutePath());
            String size = null;
            try {
                size = Files.size(path) + "bytes";
            } catch (IOException e) {
                e.printStackTrace();
            }
            String st = "INSERT INTO "+ directoryName + " VALUES ("+
                    "'" + file.getName() + "',"+
                    "'" + file.getAbsolutePath() + "',"+
                    "'" + FilenameUtils.getExtension(file.getName()) + "',"+
                    "'" + size + "'"+ ")";
            handler.execAction(st);
        }
    }

    private static String parseName(String path) {
        return new File(path).getName();
    }

    public static void main(String[] args) throws IOException {
        handler = new DatabaseHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose folder path:");
        String path = scanner.nextLine();
        File file = new File(path);
        if(!file.exists()){
            System.out.println("File does not exist");
        }
        String tableName = parseName(path);
        addTable(path);
        printTable(tableName);
    }
}
