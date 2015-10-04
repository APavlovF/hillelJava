public class Crypt {
    public static void main(String[] args) {
        char key = '1'; //crypt
        char[] chars = "someText".toCharArray();
        System.out.println("Crypted message: ");

        crypt(key, chars);
        String cryptedString = String.copyValueOf(chars);
        System.out.println(cryptedString);

        System.out.println("Uncrypted message: ");
        crypt(key, chars);
        String someString = String.copyValueOf(chars);
        System.out.println(someString);
    }

    private static void crypt(char key, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key;
        }
    }
}