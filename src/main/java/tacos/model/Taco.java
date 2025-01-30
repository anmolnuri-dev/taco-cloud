package tacos.model;

import lombok.Data;

import java.util.List;

@Data //Lombok automatically generates essential JavaBean methods at compile time
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
