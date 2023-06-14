package de.lsiem.immobilienbaukasten.views.immobilienbaukasten;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.lsiem.immobilienbaukasten.views.MainLayout;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.nio.file.Files;

@PageTitle("Vorschau")
@Route(value = "vorschau", layout = MainLayout.class)
@PermitAll
public final class PreviewView extends VerticalLayout {

    public PreviewView(@Autowired ResourceLoader resourceLoader) {
        Resource resource = resourceLoader.getResource("classpath:iframe.html");
        String iframeContent;
        try {
            iframeContent = Files.readString(resource.getFile().toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        var html = new Html(iframeContent);
        add(html);
    }
}
