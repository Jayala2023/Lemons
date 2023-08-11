package com.poordash.poordash;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.request.resource.CssResourceReference;

public class AccountCreationPage extends WebPage {

    Form form = new Form("account-creation");
    public AccountCreationPage() {
        add(form);

    }

    @Override
    public void renderHead(IHeaderResponse response) {
        response.render(CssHeaderItem.forReference(new CssResourceReference(HomePage.class, "accountPage.css")));
    }
}
