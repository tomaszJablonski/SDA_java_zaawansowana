package wzorceProjektowe.wzorceBehawioralne.chainOfResponsibility;

public abstract class BaseHendler implements Handler{

    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle() {
        if(nextHandler == null ){
            return;
        }
        this.nextHandler.handle();
    }
}
