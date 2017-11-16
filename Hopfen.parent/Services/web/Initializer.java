package web;

import com.sun.istack.internal.Nullable;
import config.ServiceConfiguration;
import config.ServletConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
	return new Class[]{ ServiceConfiguration.class};
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
	return new Class[] { ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
	return new String[]{"/rest/*"};
    }
}
