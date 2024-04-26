package co.com.choucair.automation.android.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_INPUT = Target.the("Escribir el Email")
            .located(By.id("org.wordpress.android:id/input"));
    public static final Target CONTINAR_EMAIL_BUTTON = Target.the("Boton Continuar Email")
            .located(By.id("org.wordpress.android:id/login_continue_button"));
    public static final Target PASSWORD_INPUT = Target.the("Escribir Pass")
            .located(By.id("org.wordpress.android:id/input"));
    public static final Target CONTINUAR_PASS_BUTTON = Target.the("Boton Continuar Pass")
            .located(By.id("org.wordpress.android:id/bottom_button"));
    public static final Target TEXTO_INICIO_SESION = Target.the("Texto Inicio sesion")
            .located(By.id("org.wordpress.android:id/my_site_title_label"));
    public static final Target PASAR_INTERFACE = Target.the("entrar ambiente")
            .located(By.id("org.wordpress.android:id/text_title"));
}
