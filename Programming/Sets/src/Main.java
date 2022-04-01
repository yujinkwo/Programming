import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("illiad.txt"));
        HashSet<String> uniqueWords = new HashSet<>();
        while (scanner.hasNextLine()) {
            String[] split = scanner.nextLine().toLowerCase().split("\\W");
            uniqueWords.addAll(Arrays.asList(split));
        }
        uniqueWords.remove("");
        System.out.println(uniqueWords.size());
        for (String str : uniqueWords) {
            System.out.println(str);
        }
    }
}
