package wzorceProjektowe.wzorceKreacyjne.factoryMethod.gameFactory;

public class ValorantGameFactory implements GameFactory{



    @Override
    public Game create() {
        return new PcGame("Valorant",GameType.PC_GAME);

    }
}
