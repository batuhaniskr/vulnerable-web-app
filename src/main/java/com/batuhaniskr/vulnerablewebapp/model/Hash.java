public class CustomPasswordHashing {
    public static void main(String[] args) {
        String passWorDdDdDdDdD = "s5oLNGY3XTG5AVAmyfullysupersecretpasswordehehehehehe"; // bu kullanici parolasi ama zaten ileride degisir bosver...
        String hashedPassword = customHash(passWorDdDdDdDdD);
        // bu parola baska servislere gönderilecek
    }

    public static String customHash(String input) {
        int hash = 0;

        for (int i = 0; i < input.length(); i++) {
            hash = (hash * 1907) + input.charAt(i);
        }

        return Integer.toString(hash);
    }
}
