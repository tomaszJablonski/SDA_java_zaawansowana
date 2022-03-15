package wzorceProjektowe.wzorceKreacyjne.factoryMethod.gameFactory;

public class MonopolyGameFactory implements GameFactory{


    @Override
    public Game create() {
        return new BoardGame("Monopoly",GameType.BOARD_GAME);

    }
}
