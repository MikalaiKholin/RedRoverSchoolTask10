public class TrafficLights {
    public static String updateLight(String current) {
        return switch (current){
            case ("green"):
                yield "yellow";
            case ("yellow"):
                yield "red";
            default :
                yield "green";
        };
    }
}
