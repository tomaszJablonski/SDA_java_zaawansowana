package WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.factoryMethod;

public class PcGame implements Game{

    private String name;
    private GameType type;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public GameType getGameType() {
        return type;
    }

    public PcGame(String name, GameType type) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}