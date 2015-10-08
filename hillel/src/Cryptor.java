/**
 * Created by Oleksandr on 07.10.2015.
 */
public class Cryptor {
   private char[] keyChar;


    public Cryptor(String keyString) {
        keyChar = keyString.toCharArray();
    }

    public String crypt(String message) {
        char[] cryptedCharMessage = message.toCharArray();
        int j = 0;
        for (int i = 0; i < cryptedCharMessage.length; i++) {
            if (i % keyChar.length == 0) {
                j = 0;
            }
            cryptedCharMessage[i] ^= keyChar[j];
            j++;
        }
        String cryptedMessage = String.copyValueOf(cryptedCharMessage);
        return cryptedMessage;
    }
}
