package WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.abstractFactory;

public class BoardGame implements Game {

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

    public BoardGame(String name, GameType type) {
        this.name = name;
        this.type = type;
    }
}
