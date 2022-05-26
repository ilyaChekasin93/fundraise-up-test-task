package com.fundraiseup.di.configuration;

import com.fundraiseup.browser.engine.BrowserEngine;
import com.fundraiseup.browser.manager.BrowserManager;
import com.fundraiseup.browser.manager.impl.BrowserManagerImpl;
import com.fundraiseup.page.MainPage;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class ConfigurationModule extends AbstractModule {

    protected void configure() {
        BrowserManager browserManager = new BrowserManagerImpl();
        BrowserEngine browserEngine = browserManager.openBrowser();

        bind(BrowserManager.class)
                .toProvider(() -> browserManager).in(Singleton.class);
        bind(BrowserEngine.class)
                .toProvider(() -> browserEngine).in(Singleton.class);
        bind(MainPage.class)
                .toProvider(() -> new MainPage(browserEngine))
                .in(Singleton.class);
    }

}
