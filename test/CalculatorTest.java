import _3004.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Aufbau der Testfälle nach dem Triple A-Muster:
// Arrange  -> Vorbereiten der Umgebung, hier erstellen einer Instanz von Calculator
// Act      -> Die Aktion die getestet werden soll wird ausgeführt, hier die Methode div
// Assert   -> Überprüfen ob, das Ergebnis der Erwartung entspricht
public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Teile 4 durch 2")
    public void divide1() {
        int result = calculator.div(4, 2);
        assertEquals(2, result);
    }

    @Test
    @DisplayName("Teile 5 durch 3")
    public void divide2() {
        int result = calculator.div(5, 3);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Teile 5 durch 0")
    public void divide3() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculator.div(5, 0));
        assertEquals("Wir teilen nicht durch 0", exception.getMessage());
    }
}
