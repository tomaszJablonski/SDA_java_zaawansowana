package wzorceProjektowe.wzroceStrukturalne.compsite;


import java.util.ArrayList;
import java.util.List;

//Węzeł(Node)
public class Box implements Component {
    // musi być stworzona lista która będzie budować funkcje rekurencyjną która
    // doda do drzewa kolejne elementy

    private List<Component> children = new ArrayList<>();

    public void addChild(Component component) {
        children.add(component);
    }

    public void removeChild(Component component) {
        children.remove(component);
    }

//    public List<Component> getChildren(){
//        return children;
//    }

    //funkcja rekurencyjna!!!
    @Override
    public double calculatePrice() {
        double totalPrice=0;
        for (Component component: children){
            totalPrice += component.calculatePrice();
        }
        return totalPrice;
    }
}
