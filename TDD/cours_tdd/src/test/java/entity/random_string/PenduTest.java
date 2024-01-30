package entity.random_string;

import org.example.entity.random_string.LePendu;
import org.example.entity.random_string.WordGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PenduTest {

    private LePendu lePendu;
    @Mock
    private WordGenerator wordGenerator;
    @BeforeEach
    void setup(){
       wordGenerator = Mockito.mock(WordGenerator.class);
        when(wordGenerator.getRandomWord(any())).thenReturn("groovy");
        lePendu = new LePendu(wordGenerator);
    }

    @Test
    void generateMaskTest() {
        String mask = lePendu.generateMask();

        Assertions.assertEquals("______", mask);
    }

    @Test
    void isCharInWordTest() {

        Assertions.assertTrue(lePendu.isCharInWord('o'));

    }
    @Test
    void isNotChartInWordTest(){
        Assertions.assertFalse(lePendu.isCharInWord('l'));
    }
    @Test
    void isPlayerWinTest() {

        // Act & Assert
        Assertions.assertFalse(lePendu.isPlayerWin());

        lePendu.isCharInWord('g');
        lePendu.isCharInWord('r');
        lePendu.isCharInWord('o');
        lePendu.isCharInWord('o');
        lePendu.isCharInWord('v');
        lePendu.isCharInWord('y');

        Assertions.assertTrue(lePendu.isPlayerWin());
    }
    @Test
    void playerDoesNotWinInitially() {

        Assertions.assertFalse(lePendu.isPlayerWin());
    }
    @Test
    void correctGuessFirstLetterUpdatesMask() {
        lePendu.isCharInWord('g');
        Assertions.assertEquals("g_____", lePendu.generateMask());
    }
    @Test
    void correctGuessSecondLetterUpdatesMask() {
        System.out.println("Before: " + lePendu.getMask());
        lePendu.isCharInWord('r');
        System.out.println("After: " + lePendu.getMask());
        Assertions.assertEquals("gr____", lePendu.generateMask());
    }

}
