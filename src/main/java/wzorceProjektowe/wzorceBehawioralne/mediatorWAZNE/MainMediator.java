package wzorceProjektowe.wzorceBehawioralne.mediatorWAZNE;

public class MainMediator implements Mediator{


    @Override
    public void notify(Component component) {
        System.out.println("Notification from " + component.toString());

    }
}
