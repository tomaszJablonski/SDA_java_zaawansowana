package WzorceProjektowe.wzorceKonstrukcyjne.wzorceBehawioralne.Mediator;

public class Main {
    public static void main(String[] args) {

        MainMediator mediator = new MainMediator();

        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);
        ComponentC componentC = new ComponentC(mediator);

        componentB.operationB();

    }
}
