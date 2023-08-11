package com.poordash.poordash;


import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.request.resource.CssResourceReference;


public class HomePage extends WebPage {

    Form form = new Form("form");
    Image navImage = new Image("header-logo", "poordash_2.png");

    Image restImage = new Image("restaurant-img", "mcdonalds.png");
    public HomePage() {
        add(form);

        form.add(navImage);
        form.add(restImage);
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        response.render(CssHeaderItem.forReference(new CssResourceReference(HomePage.class, "main.css")));
    }

}
