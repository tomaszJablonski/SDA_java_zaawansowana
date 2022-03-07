package WzorceProjektowe.wzorceKonstrukcyjne.wzorceKreacyjne.abstractFactory;

public class RpgGameFactory implements GameFactory{

    @Override
    public PcGame createPcGame() {
        return new PcGame("Monopoly",GameType.PC_GAME);
    }

    @Override
    public BoardGame createBoardGame() {
        return new BoardGame("Monopoly", GameType.BOARD_GAME);
    }
}
