package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("go to login page")
    public void go_to_login_page() {
        System.out.println("Sayfaya Gidildi.");
    }

    @And("type username")
    public void type_username() {
        System.out.println("username dolduruldu.");
    }

    @And("type password")
    public void type_password() {
        System.out.println("sifre girildi.");
    }

    @When("click button")
    public void click_button() {
        System.out.println("Sbutona tiklandi.");
    }

    @Then("assert to success message")
    public void assert_to_success_message() {
        System.out.println("Basarili mesaj goruldu.");
    }
}
