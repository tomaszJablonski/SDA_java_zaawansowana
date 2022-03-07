package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.adapter;

public class Adapter implements NewInterface{

    private final OldAPI oldAPI;

    public Adapter(OldAPI oldAPI) {
        this.oldAPI = oldAPI;
    }

    @Override
    public float getTemperature() {
        APIResponse apiResponse = this.oldAPI.getWeatherData();
        float temperatureInFahrenheit = apiResponse.getTemperature()*9/5+32;
        return temperatureInFahrenheit;
    }
}
