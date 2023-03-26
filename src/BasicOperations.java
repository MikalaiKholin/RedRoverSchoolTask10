public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {
        return switch (op){
            case ("+"):
                yield v1 + v2;
            case ("-"):
                yield v1 - v2;
            case ("*"):
                yield v1 * v2;
            default :
                if (v2 == 0) yield null;
                yield v1 / v2;
        };
    }
}
