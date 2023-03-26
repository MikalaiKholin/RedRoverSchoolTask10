public class RemoveFirstAndLastCharacter {
    public static String remove(String str) {
        return (new StringBuilder(str).deleteCharAt(str.length() - 1).deleteCharAt(0)).toString();
    }
}
