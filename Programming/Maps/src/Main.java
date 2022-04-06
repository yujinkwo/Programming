import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Owner owner = new Owner(2);
        System.out.println(owner.encryptWord("hello"));

        System.out.println("Done");

    }
}
