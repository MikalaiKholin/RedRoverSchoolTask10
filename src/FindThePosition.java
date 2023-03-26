public class FindThePosition {
    public static String position(char alphabet)
    {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) sb.append(c);
        return String.format("Position of alphabet: %d", sb.indexOf(String.valueOf(alphabet)) + 1);
    }
}
