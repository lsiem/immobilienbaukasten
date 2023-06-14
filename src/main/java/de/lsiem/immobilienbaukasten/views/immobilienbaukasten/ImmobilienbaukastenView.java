package de.lsiem.immobilienbaukasten.views.immobilienbaukasten;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.avatar.AvatarGroup;
import com.vaadin.flow.component.avatar.AvatarGroup.AvatarGroupItem;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import de.lsiem.immobilienbaukasten.views.MainLayout;
import jakarta.annotation.security.PermitAll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@PageTitle("Immobilienbaukasten")
@Route(value = "", layout = MainLayout.class)
@PermitAll
public final class ImmobilienbaukastenView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private H2 newHeader = new H2();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private H4 generalHeader = new H4();

    private HorizontalLayout layoutRow3 = new HorizontalLayout();

    private TextField titleField = new TextField();

    private TextField subtitleField = new TextField();

    private NumberField sizeLabel = new NumberField();

    private NumberField livingSpaceLabel = new NumberField();

    private TextField amountOfRoomsLabel = new TextField();

    private DatePicker dateOfBuildLabel = new DatePicker();

    private Hr hr = new Hr();

    private H5 areaTitle = new H5();

    private RichTextEditor richTextEditor = new RichTextEditor();

    private H5 descriptionTitle = new H5();

    private RichTextEditor richTextEditor2 = new RichTextEditor();

    private H5 propertiesTitle = new H5();

    private RichTextEditor richTextEditor3 = new RichTextEditor();

    private H5 enevTitle = new H5();

    private RichTextEditor richTextEditor4 = new RichTextEditor();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private H5 outerViewTitle = new H5();

    private AvatarGroup avatarGroup = new AvatarGroup();

    private H5 groundTitle = new H5();

    private AvatarGroup avatarGroup2 = new AvatarGroup();

    private Hr hr2 = new Hr();

    private H5 additionalTitle = new H5();

    private RichTextEditor richTextEditor5 = new RichTextEditor();

    private H5 infoTitle = new H5();

    private RichTextEditor richTextEditor6 = new RichTextEditor();

    private VerticalLayout layoutColumn4 = new VerticalLayout();

    private H4 previewTitle = new H4();

    private HorizontalLayout layoutRow4 = new HorizontalLayout();

    public ImmobilienbaukastenView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        newHeader.setText("Neue Immobilie");
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutColumn2.setHeightFull();
        layoutColumn2.setWidth(null);
        generalHeader.setText("Allgemein");
        layoutRow3.setWidthFull();
        layoutRow3.addClassName(Gap.MEDIUM);
        titleField.setLabel("Titel");
        subtitleField.setLabel("Untertitel");
        sizeLabel.setLabel("Grundstückgröße");
        livingSpaceLabel.setLabel("Wohnfläche");
        amountOfRoomsLabel.setLabel("Anzahl der Zimmer");
        dateOfBuildLabel.setLabel("Baujahr");
        areaTitle.setText("Lage");
        descriptionTitle.setText("Beschreibung");
        propertiesTitle.setText("Ausstattung");
        enevTitle.setText("EnEV");
        layoutColumn3.setWidth(null);
        outerViewTitle.setText("Außenansichten");
        setAvatarGroupSampleData(avatarGroup);
        groundTitle.setText("Grundrisse");
        setAvatarGroupSampleData(avatarGroup2);
        additionalTitle.setText("Sonstiges / Provision");
        infoTitle.setText("Infos");
        layoutColumn4.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth(null);
        layoutRow4.setWidthFull();
        layoutRow4.addClassName(Gap.MEDIUM);
        getContent().add(layoutRow);
        layoutRow.add(newHeader);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(generalHeader);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(titleField);
        layoutRow3.add(subtitleField);
        layoutRow3.add(sizeLabel);
        layoutRow3.add(livingSpaceLabel);
        layoutRow3.add(amountOfRoomsLabel);
        layoutRow3.add(dateOfBuildLabel);
        layoutColumn2.add(hr);
        layoutColumn2.add(areaTitle);
        layoutColumn2.add(richTextEditor);
        layoutColumn2.add(descriptionTitle);
        layoutColumn2.add(richTextEditor2);
        layoutColumn2.add(propertiesTitle);
        layoutColumn2.add(richTextEditor3);
        layoutColumn2.add(enevTitle);
        layoutColumn2.add(richTextEditor4);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(outerViewTitle);
        layoutColumn3.add(avatarGroup);
        layoutColumn3.add(groundTitle);
        layoutColumn3.add(avatarGroup2);
        layoutColumn3.add(hr2);
        layoutColumn3.add(additionalTitle);
        layoutColumn3.add(richTextEditor5);
        layoutColumn3.add(infoTitle);
        layoutColumn3.add(richTextEditor6);
        layoutRow2.add(layoutColumn4);
        getContent().add(layoutRow4);
    }

    private void setAvatarGroupSampleData(AvatarGroup avatarGroup) {
        avatarGroup.add(new AvatarGroupItem("B I"));
        avatarGroup.add(new AvatarGroupItem("L D"));
        avatarGroup.add(new AvatarGroupItem("E R"));
    }
}
