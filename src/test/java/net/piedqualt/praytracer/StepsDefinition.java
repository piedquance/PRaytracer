package net.piedqualt.praytracer;

import cucumber.api.PendingException;
import io.cucumber.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

//https://medium.com/@mlvandijk/getting-started-with-cucumber-in-java-a-10-minute-tutorial-586652d2c82
public class StepsDefinition {

    Tuple a;

    @Given("^a ← tuple\\((\\d+)\\.(\\d+), -(\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)")
    public void aa_tuple(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8)  {
        // Write code here that turns the phrase above into concrete actions
        Tuple a = new Tuple(arg1, arg2, arg3, arg4);
        //throw new PendingException();
    }

    @Then("^a\\.x = (\\d+)\\.(\\d+)$")
    public void a_x(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(a.x, arg1);
        //throw new PendingException();
    }

    @Then("^a\\.y = -(\\d+)\\.(\\d+)$")
    public void a_y(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        a.y = arg1;
        //throw new PendingException();
    }

    @Then("^a\\.z = (\\d+)\\.(\\d+)$")
    public void a_z(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        a.z = arg1;
        //throw new PendingException();
    }

    @Then("^a\\.w = (\\d+)\\.(\\d+)$")
    public void a_w(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        a.w = arg1;
       // throw new PendingException();
    }

    @Then("^a is a point$")
    public void a_is_a_point() throws Exception {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^a is not a vector$")
    public void a_is_not_a_vector() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^a is not a point$")
    public void a_is_not_a_point() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^a is a vector$")
    public void a_is_a_vector() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^p ← point\\((\\d+), -(\\d+), (\\d+)\\)$")
    public void pp_point(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^p = tuple\\((\\d+), -(\\d+), (\\d+), (\\d+)\\)$")
    public void p_tuple(int arg1, int arg2, int arg3, int arg4) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^v ← vector\\((\\d+), -(\\d+), (\\d+)\\)$")
    public void vv_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^v = tuple\\((\\d+), -(\\d+), (\\d+), (\\d+)\\)$")
    public void v_tuple(int arg1, int arg2, int arg3, int arg4) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^a(\\d+) ← tuple\\((\\d+), -(\\d+), (\\d+), (\\d+)\\)$")
    public void aa_tuple(int arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^a(\\d+) ← tuple\\(-(\\d+), (\\d+), (\\d+), (\\d+)\\)$")
    public void a_tuple(int arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^a(\\d+) \\+ a(\\d+) = tuple\\((\\d+), (\\d+), (\\d+), (\\d+)\\)$")
    public void a_a_tuple(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^p(\\d+) ← point\\((\\d+), (\\d+), (\\d+)\\)$")
    public void p_point(int arg1, int arg2, int arg3, int arg4) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^p(\\d+) - p(\\d+) = vector\\(-(\\d+), -(\\d+), -(\\d+)\\)$")
    public void p_p_vector(int arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^p ← point\\((\\d+), (\\d+), (\\d+)\\)$")
    public void p_point(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^v ← vector\\((\\d+), (\\d+), (\\d+)\\)$")
    public void vvv_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^p - v = point\\(-(\\d+), -(\\d+), -(\\d+)\\)$")
    public void p_v_point(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^v(\\d+) ← vector\\((\\d+), (\\d+), (\\d+)\\)$")
    public void v_vector(int arg1, int arg2, int arg3, int arg4) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^v(\\d+) - v(\\d+) = vector\\(-(\\d+), -(\\d+), -(\\d+)\\)$")
    public void v_v_vector(int arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^zero ← vector\\((\\d+), (\\d+), (\\d+)\\)$")
    public void zero_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^zero - v = vector\\(-(\\d+), (\\d+), -(\\d+)\\)$")
    public void zero_v_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^a ← tuple\\((\\d+), -(\\d+), (\\d+), -(\\d+)\\)$")
    public void aaa_tuple(int arg1, int arg2, int arg3, int arg4) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^-a = tuple\\(-(\\d+), (\\d+), -(\\d+), (\\d+)\\)$")
    public void a_tuple(int arg1, int arg2, int arg3, int arg4) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^a \\* (\\d+)\\.(\\d+) = tuple\\((\\d+)\\.(\\d+), -(\\d+), (\\d+)\\.(\\d+), -(\\d+)\\)$")
    public void a_tuple(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^a / (\\d+) = tuple\\((\\d+)\\.(\\d+), -(\\d+), (\\d+)\\.(\\d+), -(\\d+)\\)$")
    public void a_tuple(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^magnitude\\(v\\) = (\\d+)$")
    public void magnitude_vv(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^magnitude\\(v\\) = √(\\d+)$")
    public void magnitude_v(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^v ← vector\\(-(\\d+), -(\\d+), -(\\d+)\\)$")
    public void v_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^normalize\\(v\\) = vector\\((\\d+), (\\d+), (\\d+)\\)$")
    public void normalize_v_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^normalize\\(v\\) = approximately vector\\((\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void normalize_v_approximately_vector(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^norm ← normalize\\(v\\)$")
    public void norm_normalize_v() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^magnitude\\(norm\\) = (\\d+)$")
    public void magnitude_norm(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^a ← vector\\((\\d+), (\\d+), (\\d+)\\)$")
    public void a_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^b ← vector\\((\\d+), (\\d+), (\\d+)\\)$")
    public void b_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^dot\\(a, b\\) = (\\d+)$")
    public void dot_a_b(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^cross\\(a, b\\) = vector\\(-(\\d+), (\\d+), -(\\d+)\\)$")
    public void cross_a_b_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^cross\\(b, a\\) = vector\\((\\d+), -(\\d+), (\\d+)\\)$")
    public void cross_b_a_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^c ← color\\(-(\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void cc_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^c\\.red = -(\\d+)\\.(\\d+)$")
    public void c_red(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^c\\.green = (\\d+)\\.(\\d+)$")
    public void c_green(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^c\\.blue = (\\d+)\\.(\\d+)$")
    public void c_blue(int arg1, int arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^c(\\d+) ← color\\((\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void cc_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^c(\\d+) \\+ c(\\d+) = color\\((\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void c_cc_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^c(\\d+) - c(\\d+) = color\\((\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void c_ccc_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^c ← color\\((\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void ccc_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^c \\* (\\d+) = color\\((\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void c_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^c(\\d+) ← color\\((\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void cccc_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^c(\\d+) ← color\\((\\d+)\\.(\\d+), (\\d+), (\\d+)\\.(\\d+)\\)$")
    public void c_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^c(\\d+) \\* c(\\d+) = color\\((\\d+)\\.(\\d+), (\\d+)\\.(\\d+), (\\d+)\\.(\\d+)\\)$")
    public void c_c_color(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^n ← vector\\((\\d+), (\\d+), (\\d+)\\)$")
    public void n_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^r ← reflect\\(v, n\\)$")
    public void r_reflect_v_n() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^r = vector\\((\\d+), (\\d+), (\\d+)\\)$")
    public void r_vector(int arg1, int arg2, int arg3) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^n ← vector\\(√(\\d+)/(\\d+), √(\\d+)/(\\d+), (\\d+)\\)$")
    public void n_vector(int arg1, int arg2, int arg3, int arg4, int arg5) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

//    Feature: Tuples, Vectors, and Points
//
//    @TupleTest1
//    Scenario: A tuple with w=1.0 is a point # src/test/ressources/net.piedqualt.praytracer/tuples.feature:4
}
