package wzorceProjektowe.wzorceBehawioralne.mediatorWAZNE;

public class ComponentC extends Component{

    public ComponentC(Mediator mediator) {
        super(mediator);
    }

    public void operationC(){
        this.mediator.notify(this);
    }
}
