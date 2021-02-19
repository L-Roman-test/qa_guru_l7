import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.is;


public class SimpleTest {
    int a = 5;
    int b = 2;

    @Test
    @Tag("positive")
    @DisplayName("Positive test")
    public void multiplication() {
        step("Сheck that multiplication is performed correctly", () -> {
            int c = a * b;
            assertEquals(10, c);
        });
    }

    @Test
    @Tag("positive")
    @DisplayName("Positive test with Hamcrest")
    void successWithHamcrest() {
        step("Assert that true is true", () ->
                assertThat(true, is(true)));
    }

    @Test
    @DisplayName("Negative test with Hamcrest")
    void negativeWithHamcrest() {
        step("Assert that true is false", () ->
                assertThat(true, is(false)));
    }
}