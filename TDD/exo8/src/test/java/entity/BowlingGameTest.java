package entity;

import org.example.entity.BowlingGame;
import org.example.entity.PinGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BowlingGameTest {

    @Mock
    private PinGenerator pinGenerator;
    private BowlingGame bowlingGame;

    @BeforeEach
    void setUp() {
        bowlingGame = new BowlingGame(pinGenerator);
        Mockito.lenient().when(pinGenerator.generatePin()).thenReturn(1);
    }




    @Test
    void gutterTest(){
        for (int i = 0; i < 20; i++){
            bowlingGame.roll(0);
        }
        Assertions.assertEquals(0, bowlingGame.score());
    }

    @Test
    void strikeTest() {
        bowlingGame.roll(20);
        Assertions.assertEquals(20, bowlingGame.score());
    }

    @Test
    void firstThrowInSeriesShouldIncreaseScore() {
        bowlingGame.roll(4);
        Assertions.assertEquals(4, bowlingGame.score());
    }

    @Test
    void secondThrowInSeriesShouldIncreaseScore() {
        bowlingGame.roll(3);
        bowlingGame.roll(5);
        Assertions.assertEquals(8, bowlingGame.keepingScoreRound());
    }

    @Test
    void cannotRollMoreThanTwiceInStandardSeries() {
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        bowlingGame.roll(5);

        Assertions.assertEquals(7, bowlingGame.score());
        // score = 7 beacause it counts the 1st and 2nd throw and not the third
    }

    @Test
    void canRollAgainAfterSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5); // Spare

        // Verify that the score is 10  allows rolling again
        Assertions.assertTrue(bowlingGame.canRollAgain());
    }
    @Test
    void scoreIncreasesAfterSpareAndNextRoll() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);

        // Troisième lancer après le spare
        bowlingGame.roll(6);

        // Le score devrait être le total des deux lancers (5 + 5) + le résultat du prochain lancer (3)
        Assertions.assertEquals(16, bowlingGame.score());
    }



}
