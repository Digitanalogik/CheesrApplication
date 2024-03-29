package fi.cheese.store;

import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;

import fi.cheese.store.services.CheeseService;
import fi.cheese.store.services.DefaultCheeseService;

@WicketHomePage
public class CheesrStore extends CheesrPage {

	private CheeseService cheeseService;

	public CheesrStore() {

		cheeseService = new DefaultCheeseService();

		add(new Label("title", "Cheese Store Application"));

		List<Cheese> tmpList = cheeseService.getCheeses();

		add(new ListView("cheeses", cheeseService.getCheeses()) {
			@Override
			protected void populateItem(ListItem item) {
				Cheese cheese = (Cheese) item.getModelObject();
				item.add(new Label("name", cheese.getName()));
				item.add(new Label("description", cheese.getDescription()));
				item.add(new Label("price", cheese.getPrice()));
				item.add(new Link("add", item.getModel()) {
					@Override
					public void onClick() {
						Cheese selected = (Cheese) getModelObject();
						getCart().getCheeses().add(selected);
					}
				});
			}
		});
	}
}
