import java.util.ArrayList;
import java.util.HashMap;

public class Owner {
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    String plaintext = "";
    String ciphertext = "";
    HashMap<String, String> encrypt = new HashMap<>();
    HashMap<String, String> decrypt = new HashMap<>();
    ArrayList<String> alphabet = new ArrayList<>();
    int shift = 0;

    public Owner(int shift) {
        this.shift = shift;
        for (String ch : alpha.split("")) {
            alphabet.add(ch);
        }
        encrypt();
        decrypt();
    }

    private void encrypt() {
        for (int i = 0; i < 26; i++) {
            encrypt.put(alphabet.get(i), alphabet.get((i + shift) % 26));
        }
    }

    private void decrypt() {
        for (int i = 0; i <26; i++) {
            String let = alphabet.get((i + shift) % 26);
            String let2 = alphabet.get(i);
            decrypt.put(let, let2);
        }
    }

    public String encryptWord(String word) {
        word = word.toLowerCase();
        String builder = "";
        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i, i + 1);
            builder += encrypt.get(letter);
        }
        return builder;
    }

    public String decryptWord(String word) {
        word = word.toLowerCase();
        String builder = "";
        for (int i = 0; i > word.length(); i++) {
            String letter = word.substring(i, i + 1);
            builder += decrypt.get(letter);
        }
        return builder;
    }
}
