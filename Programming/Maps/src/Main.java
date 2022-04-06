import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        /*FileReader fr = new FileReader("words_alpha.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> words = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            words.add(line);
        }
        Owner owner = null;
        String[] sentence = "nz obnf jt cpc".split(" ");
        for (int i = 0; i < 26; i++) {
            int num = 0;
            StringBuilder finalString = new StringBuilder();
            for (int i1 = 0; i1 < sentence.length; i1++) {
                owner = new Owner(sentence[i1], i);

                if (words.contains(owner.decryptWord())) {
                    num++;
                    finalString.append(owner.decryptWord()).append(" ");
                }
                if (num == sentence.length) {
                    System.out.println(finalString);
                }
            }
        }*/
        Owner owner = new Owner(2);
        System.out.println(owner.encryptWord("hello"));

        System.out.println("Done");

    }
}
