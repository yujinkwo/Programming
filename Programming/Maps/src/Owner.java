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

    public Owner(String word, int shift) {
        plaintext = word;
        this.shift = shift;
        for (String ch : alpha.split("")) {
            alphabet.add(ch);
        }
        encrypt();
        decrypt();
    }

    private void encrypt() {
        for (int i = 0; i < 26; i++) {
            int shiftAmount = i + shift;
            while (shiftAmount >= 26) {
                shiftAmount -= 26;
            }
            encrypt.put(alphabet.get(i), alphabet.get((i + shift) % 26));
        }
    }

    private void decrypt() {
        for (int i = 25; i >= 0; i--) {
            int shiftAmount = i - shift;
            while (shiftAmount < 0) {
                shiftAmount += 26;
            }
            decrypt.put(alphabet.get((i + shift) % 26), alphabet.get(i));
        }
    }

    public String encryptWord() {
        StringBuilder encryptedWord = new StringBuilder();
        for (String s : plaintext.split("")) {
            encryptedWord.append(encrypt.get(s));
        }
        return encryptedWord.toString();
    }

    public String decryptWord() {
        StringBuilder decryptedWord = new StringBuilder();
        for (String s : plaintext.split("")) {
            decryptedWord.append(decrypt.get(s));
        }
        return decryptedWord.toString();
    }
}



