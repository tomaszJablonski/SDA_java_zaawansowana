package WzorceProjektowe.wzorceKonstrukcyjne.wzroceStrukturalne.bridge;

public class Coffie implements Drink{
    @Override
    public String getVolume() {
        return "70 ml";
    }

    @Override
    public boolean isAddictive() {
        return true;
    }
}
