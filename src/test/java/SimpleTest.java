import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

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


}