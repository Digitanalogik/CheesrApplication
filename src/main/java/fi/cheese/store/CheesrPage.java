package fi.cheese.store;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;

public abstract class CheesrPage extends WebPage {

    public CheesrSession getCheesrSession() {
        return (CheesrSession) getSession();
    }

    public Cart getCart() {
        return getCheesrSession().getCart();
    }

}
