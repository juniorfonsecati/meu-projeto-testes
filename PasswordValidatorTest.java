import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    @Test
    void shouldRejectNullOrShortPassword() {
        assertAll(
            () -> assertFalse(validator.isValid(null)),
            () -> assertFalse(validator.isValid("1234567"))
        );
    }

    @Test
    void shouldRejectWithoutUppercase() {
        assertFalse(validator.isValid("lowercaseno1"));
    }

    @Test
    void shouldRejectWithoutDigit() {
        assertFalse(validator.isValid("OnlyLetters"));
    }

    @Test
    void shouldAcceptValidPassword() {
        assertTrue(validator.isValid("ValidPass123"));
    }
}