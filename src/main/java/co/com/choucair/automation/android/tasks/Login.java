package co.com.choucair.automation.android.tasks;

import co.com.choucair.automation.android.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {

    private String     user;
    private String password;

    public Login(String user, String password){
        this.user = user;
        this.password = password;
    }

    public static Login with(String user, String password){
        return Tasks.instrumented(Login.class,user,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(user).into(LoginPage.EMAIL_INPUT),
                Click.on(LoginPage.CONTINAR_EMAIL_BUTTON),
                Enter.theValue(password).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.CONTINUAR_PASS_BUTTON),
                Click.on(LoginPage.PASAR_INTERFACE)
        );
    }
}
