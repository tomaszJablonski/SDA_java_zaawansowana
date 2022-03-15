package wzorceProjektowe.wzorceKreacyjne.prototype.creatClone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Alien implements ProtoType {

    private String name;
    private Double height;
    private Double weight;

    @Override
    public ProtoType createClone() {
        return new Alien(name, height, weight);
    }
}
