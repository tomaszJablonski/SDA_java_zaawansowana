package wzorceProjektowe.wzorceBehawioralne.Mediator;

public class ComponentA extends Component{

    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    public void operationA(){
        this.mediator.notify(this);
    }

}
