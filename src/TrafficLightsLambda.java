
public interface TrafficLightsLambda {
    public static String updateLight(String current) {
        return  Lights.valueOf(current.toUpperCase()).getNext();
    }
}



