package web;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CheesrApplication extends WebApplication {
    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder()
                .sources(CheesrApplication.class)
                .run(args);
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return CheesrStore.class;
    }

}
