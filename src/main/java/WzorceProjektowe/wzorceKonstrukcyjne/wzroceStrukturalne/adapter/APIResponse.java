package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.adapter;

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

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(String cloudiness) {
        this.cloudiness = cloudiness;
    }

    @Override
    public String toString() {
        return "APIResponse{" +
                "temperature=" + temperature +
                ", cloudiness='" + cloudiness + '\'' +
                '}';
    }
}
