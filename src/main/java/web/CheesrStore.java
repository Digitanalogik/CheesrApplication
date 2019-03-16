package web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;

@WicketHomePage
public class CheesrStore extends WebPage {

    public CheesrStore() {

        add(new Label("message", "Cheese Store Application"));

    }
}

