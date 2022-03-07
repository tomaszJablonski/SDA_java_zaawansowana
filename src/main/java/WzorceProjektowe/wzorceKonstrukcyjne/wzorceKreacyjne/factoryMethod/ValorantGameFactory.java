package WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.factoryMethod;

public class ValorantGameFactory implements GameFactory{



    @Override
    public Game create() {
        return new PcGame("Valorant",GameType.PC_GAME);

    }
}
