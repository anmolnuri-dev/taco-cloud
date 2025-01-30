package tacos.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {

    //Five properties for delivery
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryProvince;
    private String deliveryPostalCode;

    //Three attributes for Payment
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    //List of taco objects that up the order.
    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
