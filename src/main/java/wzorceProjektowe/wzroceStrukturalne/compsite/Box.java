package wzorceProjektowe.wzroceStrukturalne.compsite;


import java.util.ArrayList;
import java.util.List;

//Composite
public class Box implements Component {

    private List<Component> children =new ArrayList<>();

    public void addChild(Component component){
        children.add(component);
    }

    public void removeChild(Component component){
        children.remove(component);
    }

//    public List<Component> getChildren(){
//        return children;
//    }

    @Override
    public double calculatePrice() {
        double totalPrice=0;
        for (Component component: children){
            totalPrice += component.calculatePrice();

        }
        return totalPrice;
    }
}
