package Lesson_13.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs extends Base {

    @Given("open_login_page")
    public void open_login_page_c() throws Exception {
        setUp();
        login_page
                .open_login_page();
    }

    @And("^username_field_fill$")
    public void username_field_fill_c() throws Exception {
        login_page
                .username_field_fill();
    }

    @And("^password_field_fill$")
    public void password_field_fill_c() throws Exception {
        login_page
                .password_field_fill();
    }

    @When("^login_bttn_click$")
    public void login_bttn_click_c() throws Exception {
        login_page
                .login_bttn_click();
    }

    @Then("^verify_home_page$")
    public void verify_home_page_c() throws Exception {
        login_page
                .verify_home_page();
        tearDown();
    }
}
