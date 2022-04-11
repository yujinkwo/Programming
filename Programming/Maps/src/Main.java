public class Main {
    public static void main(String[] args) {

        Owner owner = new Owner(2);
        String encryptWord = owner.encryptWord("hello");
        System.out.println(encryptWord);
        System.out.println(owner.decryptWord(encryptWord));
        System.out.println("Done");
    }
}
