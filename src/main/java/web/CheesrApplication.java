package web;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.wicket.Application;
import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CheesrApplication extends WebApplication {

    private List<Cheese> cheeses = Arrays.asList(
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

    public CheesrApplication() {
    }

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder()
                .sources(CheesrApplication.class)
                .run(args);
    }

    @Override
    protected void init() {
    }

    public static CheesrApplication get() {
        return (CheesrApplication) Application.get();
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return CheesrStore.class;
    }

    public List<Cheese> getCheeses() {
        return Collections.unmodifiableList(cheeses);
    }

    public Session newSession(Request request, Response response) {
        return new CheesrSession(request);
    }
}
