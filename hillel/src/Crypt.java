public class Crypt {
    public static void main(String[] args) {
        char key = '7'; //crypt
        char[] chars = "someText".toCharArray();
        System.out.println("Crypted message: ");

        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key;
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("Uncrypted message: ");
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key;
        }
        String someString = String.copyValueOf(chars);
        System.out.println(someString);
    }
}