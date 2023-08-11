package com.poordash.poordash;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.request.resource.CssResourceReference;

public class AccountPage extends WebPage {

    Form form = new Form("account-page");
    Image navImage = new Image("header-logo", "poordash_2.png");

    public AccountPage() {
        add(form);

        form.add(navImage);

    }

    @Override
    public void renderHead(IHeaderResponse response) {
        response.render(CssHeaderItem.forReference(new CssResourceReference(HomePage.class, "accountPage.css")));
    }
}
