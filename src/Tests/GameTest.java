import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    public Game game;

    @BeforeEach
    void setup() {
        game = new Game();
    }

    @Test
    void validChoice() {
        for(int i = 0; i < 50; i++) {
            if(i == 1 || i == 2) {
                String message = String.format("%s should have returned true", i);
                assertTrue(game.validChoice(i), message);
            }
            else {
                String message = String.format("%s should have returned false", i);
                assertFalse(game.validChoice(i), message);
            }
        }
    }

    @Test
    void checkingIfFailure() {
        game.failure();
        assertFalse(game.playing, "Playing should be false after failure method");
    }

    @Test
    void checkingIfSuccess() {
        game.success();
        assertFalse(game.playing, "Playing should be false after success method");
    }
}