public class Isogram {
    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; i != j; j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Isogram.isIsogram("ahjdvrw"));
        System.out.println(Isogram.isIsogram("hgdsgawawfwa"));
        System.out.println(Isogram.isIsogram("hyfjsawghmh342"));

    }
}

