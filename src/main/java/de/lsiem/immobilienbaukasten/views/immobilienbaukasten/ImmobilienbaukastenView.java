package de.lsiem.immobilienbaukasten.views.immobilienbaukasten;

import com.vaadin.flow.component.Composite;
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
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import de.lsiem.immobilienbaukasten.views.MainLayout;
import jakarta.annotation.security.PermitAll;

@PageTitle("Immobilienbaukasten")
@Route(value = "", layout = MainLayout.class)
@PermitAll
public class ImmobilienbaukastenView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private H2 h2 = new H2();

    private HorizontalLayout layoutRow2 = new HorizontalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private H4 h4 = new H4();

    private HorizontalLayout layoutRow3 = new HorizontalLayout();

    private TextField textField = new TextField();

    private TextField textField2 = new TextField();

    private NumberField numberField = new NumberField();

    private NumberField numberField2 = new NumberField();

    private TextField textField3 = new TextField();

    private DatePicker datePicker = new DatePicker();

    private Hr hr = new Hr();

    private H5 h5 = new H5();

    private RichTextEditor richTextEditor = new RichTextEditor();

    private H5 h52 = new H5();

    private RichTextEditor richTextEditor2 = new RichTextEditor();

    private H5 h53 = new H5();

    private RichTextEditor richTextEditor3 = new RichTextEditor();

    private H5 h54 = new H5();

    private RichTextEditor richTextEditor4 = new RichTextEditor();

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private H5 h55 = new H5();

    private AvatarGroup avatarGroup = new AvatarGroup();

    private H5 h56 = new H5();

    private AvatarGroup avatarGroup2 = new AvatarGroup();

    private Hr hr2 = new Hr();

    private H5 h57 = new H5();

    private RichTextEditor richTextEditor5 = new RichTextEditor();

    private H5 h58 = new H5();

    private RichTextEditor richTextEditor6 = new RichTextEditor();

    private VerticalLayout layoutColumn4 = new VerticalLayout();

    private H4 h42 = new H4();

    private HorizontalLayout layoutRow4 = new HorizontalLayout();

    public ImmobilienbaukastenView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        h2.setText("Neue Immobilie");
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.setWidthFull();
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutColumn2.setHeightFull();
        layoutColumn2.setWidth(null);
        h4.setText("Allgemein");
        layoutRow3.setWidthFull();
        layoutRow3.addClassName(Gap.MEDIUM);
        textField.setLabel("Titel");
        textField2.setLabel("Untertitel");
        numberField.setLabel("Grundstückgröße");
        numberField2.setLabel("Wohnfläche");
        textField3.setLabel("Anzahl der Zimmer");
        datePicker.setLabel("Baujahr");
        h5.setText("Lage");
        h52.setText("Beschreibung");
        h53.setText("Ausstattung");
        h54.setText("EnEV");
        layoutColumn3.setWidth(null);
        h55.setText("Außenansichten");
        setAvatarGroupSampleData(avatarGroup);
        h56.setText("Grundrisse");
        setAvatarGroupSampleData(avatarGroup2);
        h57.setText("Sonstiges / Provision");
        h58.setText("Infos");
        layoutColumn4.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth(null);
        h42.setText("Vorschau");
        layoutRow4.setWidthFull();
        layoutRow4.addClassName(Gap.MEDIUM);
        getContent().add(layoutRow);
        layoutRow.add(h2);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(h4);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(textField);
        layoutRow3.add(textField2);
        layoutRow3.add(numberField);
        layoutRow3.add(numberField2);
        layoutRow3.add(textField3);
        layoutRow3.add(datePicker);
        layoutColumn2.add(hr);
        layoutColumn2.add(h5);
        layoutColumn2.add(richTextEditor);
        layoutColumn2.add(h52);
        layoutColumn2.add(richTextEditor2);
        layoutColumn2.add(h53);
        layoutColumn2.add(richTextEditor3);
        layoutColumn2.add(h54);
        layoutColumn2.add(richTextEditor4);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(h55);
        layoutColumn3.add(avatarGroup);
        layoutColumn3.add(h56);
        layoutColumn3.add(avatarGroup2);
        layoutColumn3.add(hr2);
        layoutColumn3.add(h57);
        layoutColumn3.add(richTextEditor5);
        layoutColumn3.add(h58);
        layoutColumn3.add(richTextEditor6);
        layoutRow2.add(layoutColumn4);
        layoutColumn4.add(h42);
        getContent().add(layoutRow4);
    }

    private void setAvatarGroupSampleData(AvatarGroup avatarGroup) {
        avatarGroup.add(new AvatarGroupItem("A B"));
        avatarGroup.add(new AvatarGroupItem("C D"));
        avatarGroup.add(new AvatarGroupItem("E F"));
    }
}
