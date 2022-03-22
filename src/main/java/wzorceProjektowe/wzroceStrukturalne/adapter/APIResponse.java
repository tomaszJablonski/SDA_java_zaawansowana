package wzorceProjektowe.wzroceStrukturalne.adapter;

public class APIResponse {

    private float temperature;
    private String cloudiness;

    public APIResponse(float temperature, String cloudiness) {
        this.temperature = temperature;
        this.cloudiness = cloudiness;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "APIResponse{" +
                "temperature=" + temperature +
                ", cloudiness='" + cloudiness + '\'' +
                '}';
    }
}
