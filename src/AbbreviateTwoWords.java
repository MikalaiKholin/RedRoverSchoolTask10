public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        int spacePosition = name.indexOf(" ");
        return (String.format("%s.%s",
                name.charAt(0), name.charAt(spacePosition + 1))).toUpperCase();
    }
}
