package wzorceProjektowe.wzorceBehawioralne.mediatorWAZNE;

public class ComponentB extends Component{

    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    public void operationB(){
        this.mediator.notify(this);
    }
}
