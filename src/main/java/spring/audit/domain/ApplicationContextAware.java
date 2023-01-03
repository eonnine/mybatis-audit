package spring.audit.domain;

import org.springframework.context.ApplicationContext;

public class ApplicationContextAware {

    private final ApplicationContext context;

    public ApplicationContextAware(ApplicationContext context) {
        this.context = context;
    }

    public ApplicationContext getApplicationContext() {
        return this.context;
    }
}