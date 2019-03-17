package fi.cheese.store.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import fi.cheese.store.Cheese;

@Service
public class DefaultCheeseService implements CheeseService {

    private List<Cheese> cheeses;

    public DefaultCheeseService() {

        cheeses = Arrays.asList(
                new Cheese("Gouda", "Gouda is yellowish Dutch...", 1.65),
                new Cheese("Edam", "Edam (Dutch Edamer) is mild...", 1.05),
                new Cheese("Maasdam", "Maasdam cheese is a Dutch...", 2.35),
                new Cheese("Brie", "Brie is soft cow's milk...", 3.15),
                new Cheese("Buxton Blue", "Buxton Blue cheese...", 0.99),
                new Cheese("Parmesan", "Parmesan is a grana...", 1.99),
                new Cheese("Cheddar", "Cheddar cheese is a hard...", 2.95),
                new Cheese("Roquefort", "Roquefort is a we...", 1.67),
                new Cheese("Boursin", "Boursin Cheese is a soft...", 1.33),
                new Cheese("Camembert", "Camembert is a soft......", 1.69),
                new Cheese("Emmental", "Emmental is a yellow, strong...", 2.39),
                new Cheese("Reblochon", "Reblochon is a French...", 2.99)
        );

    }

    @Override
    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    @Override
    public List<Cheese> getCheeses() {
        return cheeses;
    }

}
