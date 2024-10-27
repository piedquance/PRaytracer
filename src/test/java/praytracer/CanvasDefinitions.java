package praytracer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

public class CanvasDefinitions {

    Canvas c;
    @Given("c ← canvas\\({int}, {int})")
    public void c_canvas(Integer int1, Integer int2) {
        c = new Canvas(int1, int2);
    }

    String ppm;
    @When("ppm ← canvas_to_ppm\\(c)")
    public void ppm_canvas_to_ppm_c() {
        ppm = c.canvas_to_ppm(c);
    }
    @Then("lines {int}-{int} of ppm are")
    public void lines_of_ppm_are(Integer int1, Integer int2, String docString) {
        String[] s = ppm.split("\n");
        String[] r = docString.split("\n");
        for(int i = int1-1, j = 0; i < int2; i++, j++) {
            assertEquals(r[j], s[i]);
        }
    }

    Color c1, c2, c3;
    @Given("c1 ← color\\({double}, {double}, {double})")
    public void c1_color(Double double1, Double double2, Double double3) {
        c1 = new Color(double1, double2, double3);
    }
    @And("c2 ← color\\({double}, {double}, {double})")
    public void c2_color(Double double1, Double double2, Double double3) {
        c2 = new Color(double1, double2, double3);
    }
    @And("c3 ← color\\({double}, {double}, {double})")
    public void c3_color(Double double1, Double double2, Double double3) {
        c3 = new Color(double1, double2, double3);
    }

    @When("write_pixel\\(c, {int}, {int}, c1)")
    public void write_pixel_c_c1(Integer int1, Integer int2) {
        c.write_pixel(c, int1, int2, c1);
    }
    @And("write_pixel\\(c, {int}, {int}, c2)")
    public void write_pixel_c_c2(Integer int1, Integer int2) {
        c.write_pixel(c, int1, int2, c2);
    }
    @And("write_pixel\\(c, {int}, {int}, c3)")
    public void write_pixel_c_c3(Integer int1, Integer int2) {
        c.write_pixel(c, int1, int2, c3);
    }

    @Then("c.width = {int}")
    public void c_width(Integer int1) {
        assertEquals(c.width, (int)int1);
    }
    @Then("c.height = {int}")
    public void c_height(Integer int1) {
        assertEquals(c.height, (int)int1);
    }
    @Then("every pixel of c is color\\({int}, {int}, {int})")
    public void every_pixel_of_c_is_color(Integer int1, Integer int2, Integer int3) {
        for(int y = 0; y < c.height; y++) {
            for(int x = 0; x < c.width; x++) {
                assertEquals(c.grid[y][x], new Color(int1, int2, int3));
            }
        }
    }

    @Then("ppm ends with a newline character")
    public void ppm_ends_with_a_newline_character() {
        assertEquals(ppm.toCharArray()[ppm.length()-1], '\n');
    }

    @When("every pixel of c is set to color\\({double}, {double}, {double})")
    public void every_pixel_of_c_is_set_to_color(Double double1, Double double2, Double double3) {
        for(int y = 0; y < c.height; y++) {
            for(int x = 0; x < c.width; x++) {
                c.write_pixel(x,y,new Color(double1, double2, double3));
            }
        }
    }

    Color red;
    @Given("red ← color\\({int}, {int}, {int})")
    public void red_color(Integer int1, Integer int2, Integer int3) {
        red = new Color(int1, int2, int3);
    }
    @When("write_pixel\\(c, {int}, {int}, red)")
    public void write_pixel_c_red(Integer int1, Integer int2) {
        c.write_pixel(c, int1, int2, red);
    }
    @Then("pixel_at\\(c, {int}, {int}) = red")
    public void pixel_at_c_red(Integer int1, Integer int2) {
        assertEquals(c.pixel_at(c, int1, int2), red);
    }
}
