import java.lang.constant.Constable;

public class Main {
    public static void main(String[] args) {
        System.out.println(encrypt("noworries", 3));
    }


    public static String encrypt(String plainText, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        int shiftKey = 3;
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    char newC = (char) ((c - 'a' + shift) % 26 + 'a');
                    encryptedText.append(newC);
                } else {
                    char newC = (char) ((c - 'A' + shift) % 26 + 'A');
                    encryptedText.append(newC);
                }
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }
}




