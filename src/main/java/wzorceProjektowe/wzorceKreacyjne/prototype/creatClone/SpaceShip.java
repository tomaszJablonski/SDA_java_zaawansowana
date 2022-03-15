package wzorceProjektowe.wzorceKreacyjne.prototype.creatClone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class SpaceShip implements ProtoType {

    private String name;
    private Integer crew;
    private Double fuel;
    private Alien captain;


    @Override
    public ProtoType createClone() {
        return new SpaceShip(name, crew, fuel, (Alien) captain.createClone());
    }
}
