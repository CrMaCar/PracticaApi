package ar.steps;

import api.model.TimeEntryResponse;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import services.BaseService;

public class TimeEntrySteps {
    @Given("un users id")
    public void unIdDeProyectoValido() {
        BaseService.USER_ID.set("618750ecd1dc1e56c7c4523a");
    }

    @And("un id de workspace valido")
    public void unIdDeWorkspaceValido() {
        BaseService.ID_WORKSPACE.set("618c041c4e912e504bd06b1f");

    }

    @Then("Valido que los id no sean nulos")
    public void validoQueLosIdNoSeanNulos() {
        TimeEntryResponse[] response=(TimeEntryResponse[]) APIManager.getLastResponse().getResponse();
        for (TimeEntryResponse timeentryy: response){
            Assert.assertNotNull(timeentryy.getId());
        }

    }
}
