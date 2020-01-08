package calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdditionSteps {

    StringCalculator calculator = new StringCalculator();
    String input;
    String output;

    @Given("input string is empty")
    public void input_string_is_empty() {
        input = "";
    }

    @When("the calculator adds")
    public void the_calculator_adds() {
        output = calculator.add(input);
    }

    @Then("the result is an empty string")
    public void the_result_is_an_empty_string() {
        Assert.assertEquals("", output);
    }
}
