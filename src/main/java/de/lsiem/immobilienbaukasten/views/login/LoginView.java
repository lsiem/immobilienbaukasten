package de.lsiem.immobilienbaukasten.views.login;

import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.internal.RouteUtil;
import com.vaadin.flow.server.VaadinService;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import de.lsiem.immobilienbaukasten.security.AuthenticatedUser;

@AnonymousAllowed
@PageTitle("Login")
@Route(value = "login")
public class LoginView extends LoginOverlay implements BeforeEnterObserver {

    private final AuthenticatedUser authenticatedUser;

    public LoginView(AuthenticatedUser authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
        setAction(RouteUtil.getRoutePath(VaadinService.getCurrent().getContext(), getClass()));

        LoginI18n i18n = LoginI18n.createDefault();
        i18n.setHeader(new LoginI18n.Header());
        i18n.getHeader().setTitle("Anmelden");
        i18n.getHeader().setDescription("Bitte melden Sie sich an");
        i18n.setAdditionalInformation("Einloggen mit user/user oder admin/admin");
        i18n.setForm(new LoginI18n.Form());
        i18n.getForm().setUsername("Benutzer");
        i18n.getForm().setTitle("Anmelden");
        i18n.getForm().setSubmit("Anmelden");
        i18n.getForm().setPassword("Passwort");
        i18n.setErrorMessage(new LoginI18n.ErrorMessage());
        i18n.getErrorMessage().setTitle("Benutzername/Passwort ungültig");
        i18n.getErrorMessage().setMessage("Bitte überprüfen Sie Ihre Eingaben und versuchen Sie es erneut.");


        setI18n(i18n);

        setForgotPasswordButtonVisible(false);
        setOpened(true);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        if (authenticatedUser.get().isPresent()) {
            // Already logged in
            setOpened(false);
            event.forwardTo("");
        }

        setError(event.getLocation().getQueryParameters().getParameters().containsKey("error"));
    }
}
