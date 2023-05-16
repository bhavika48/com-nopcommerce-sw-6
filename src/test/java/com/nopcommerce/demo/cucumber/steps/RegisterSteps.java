package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class RegisterSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new RegisterPage().registerButton();
    }

    @And("^I enters following users details$")
    public void iEntersFollowingUsersDetails(DataTable dataTable) {
        List<List<String>> userList =   dataTable.asLists(String.class);
        for (List<String> e : userList){
           //System.out.println(e);
            System.out.println(e.get(1));
        }
    }


}
