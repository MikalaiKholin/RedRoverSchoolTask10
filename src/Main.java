import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(BasicOperations.basicMath("*",2 , 2));
        System.out.println(BasicOperations.basicMath("/",9 , 0));
        System.out.println(Arrays.toString(Sequence.reverse(10)));
        System.out.println(Arrays.toString(ArrToStr.stringToArray("I love arrays they are my favorite")));
        System.out.println(YesOrNo.boolToWord(true));
        System.out.println(AbbreviateTwoWords.abbrevName("Bill Gates"));
        System.out.println(AbbreviateTwoWords.abbrevName("stive jobs"));
        System.out.println(TheFeastOfManyBeasts.feast("brown bear","bear claw"));
        System.out.println(TheFeastOfManyBeasts.feast("great blue heron","garlic nann"));
        System.out.println(TripleTrouble.tripleTrouble("abc", "abc", "abc"));
        System.out.println(FindThePosition.position('d'));
        System.out.println(ArrayPlusArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        System.out.println(MakeUpperCase.makeUpperCase("in upper case now"));
        System.out.println(RemoveFirstAndLastCharacter.remove("abcde"));
    }
}
