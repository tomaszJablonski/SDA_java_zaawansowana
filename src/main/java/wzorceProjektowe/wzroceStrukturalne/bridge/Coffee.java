package wzorceProjektowe.wzroceStrukturalne.bridge;

public class Coffee implements Drink {

    @Override
    public String getVolume() {
        return "70 ml";
    }

    @Override
    public boolean isAddictive() {
        return true;
    }
}
