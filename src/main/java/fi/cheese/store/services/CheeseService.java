package fi.cheese.store.services;

import java.util.List;
import fi.cheese.store.Cheese;

public interface CheeseService {

    void addCheese(Cheese cheese);

    List<Cheese> getCheeses();

}
