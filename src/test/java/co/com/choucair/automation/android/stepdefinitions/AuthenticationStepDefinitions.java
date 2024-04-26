package co.com.choucair.automation.android.stepdefinitions;

import co.com.choucair.automation.android.questions.VarifyWith;
import co.com.choucair.automation.android.tasks.Login;
import co.com.choucair.automation.android.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class AuthenticationStepDefinitions {

    @Given("^Que camilo quiere entrar a la aplicacion movil$")
    public void queCamiloQuiereEntrarALaAplicacionMovil(){
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenThe.wordpressApp());
    }

    @When("^camilo entra con el usuario (.*) y pass (.*)$")
    public void camiloEntraConElUsuarioPruebaappappiumGmailComYPassPruebaapp(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(user,password));
    }

    @Then("^el verifica que ingresando correctamente con el mensaje (.*)$")
    public void elVerificaQueIngresandoCorrectamenteConElMensajeLogeadoComo(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VarifyWith.the(question)));
    }

}
