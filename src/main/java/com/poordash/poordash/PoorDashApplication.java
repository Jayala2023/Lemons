package com.poordash.poordash;

import org.apache.wicket.protocol.http.WebApplication;

public class PoorDashApplication extends WebApplication {
    public PoorDashApplication() {
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class getHomePage() {
        return HomePage.class;
    }
}
