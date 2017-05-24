package com.vaadin.tests.components.combobox;

import java.util.Date;

import com.vaadin.server.ThemeResource;
import com.vaadin.tests.components.TestBase;
import com.vaadin.ui.ComboBox;

public class ComboBoxLargeIcons extends TestBase {

    @Override
    protected Integer getTicketNumber() {
        return null;
    }

    @Override
    protected String getDescription() {
        return "<p>All items in the Combobox has large icons. The size of the dropdown should fit the contents, also when changing pages. The height of the dropdown shouldn't exceed the browser's viewport, but fewer items should be visible then.</p><p>The size of the shadow behind the dropdown must also be correctly sized.</p><p>Note that the image URL change for every restart to keep the browser from using cached images.</p>";
    }

    @Override
    protected void setup() {
        ComboBox<String> cb = new ComboBox<String>();
        cb.setItems("folder-add", "folder-delete", "arrow-down", "arrow-left",
                "arrow-right", "arrow-up", "document-add", "document-delete",
                "document-doc", "document-edit", "document-image",
                "document-pdf", "document-ppt", "document-txt", "document-web",
                "document");
        getLayout().addComponent(cb);
        // FIXME cb.setNullSelectionAllowed(false);
        cb.setItemIconGenerator(icon -> new ThemeResource(
                "../runo/icons/32/" + icon + ".png?" + new Date().getTime()));
    }
}
