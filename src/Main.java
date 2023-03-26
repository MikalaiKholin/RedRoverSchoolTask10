import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(BasicOperations.basicMath("*",2 , 2));
        System.out.println(BasicOperations.basicMath("/",9 , 0));
        System.out.println(Arrays.toString(Sequence.reverse(10)));
        System.out.println(Arrays.toString(ArrToStr.stringToArray("I love arrays they are my favorite")));
        System.out.println(YesOrNo.boolToWord(true));
    }
}
