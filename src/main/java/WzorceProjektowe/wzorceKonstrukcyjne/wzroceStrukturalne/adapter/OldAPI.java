package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.adapter;

public class OldAPI {
    APIResponse getWeatherData(){
        return new APIResponse(28.3F,"sunny");
    }
}
