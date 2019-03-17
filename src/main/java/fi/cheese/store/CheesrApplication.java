package fi.cheese.store;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.util.crypt.CharEncoding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CheesrApplication extends WebApplication {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder()
			.sources(CheesrApplication.class)
			.run(args);
	}

	@Override
	public Class<? extends Page> getHomePage() {
		return CheesrStore.class;
	}

	@Override
	public void init() {
		super.init();
		getRequestCycleSettings().setResponseRequestEncoding(CharEncoding.UTF_8);
		getMarkupSettings().setDefaultMarkupEncoding(CharEncoding.UTF_8);

		getComponentInstantiationListeners().add(new SpringComponentInjector(this, applicationContext));
		mountPage("/", CheesrStore.class);
	}

}
