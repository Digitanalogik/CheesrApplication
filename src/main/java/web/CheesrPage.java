package web;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;

public abstract class CheesrPage extends WebPage {

    public CheesrSession getCheesrSession() {
        return (CheesrSession) getSession();
    }

    public Cart getCart() {
        return getCheesrSession().getCart();
    }

    public List<Cheese> getCheeses() {
        Cheese emmental = new Cheese("Emmental", "Solid, intensive, yellow", 2.5);
        Cheese edam = new Cheese("Edam", "Soft, mild, pale", 1.8);

        List<Cheese> cheeseList = new ArrayList<>();

        cheeseList.add(emmental);
        cheeseList.add(edam);

        return cheeseList;
        //return CheesrApplication.get().getCheeses();
    }

}
