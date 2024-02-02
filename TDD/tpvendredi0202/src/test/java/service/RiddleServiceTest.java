package service;

import com.example.tpvendredi0202.Exception.RepositoryException;
import com.example.tpvendredi0202.entity.Riddle;
import com.example.tpvendredi0202.repository.RiddleRepository;
import com.example.tpvendredi0202.service.RiddleService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class RiddleServiceTest {

    private Riddle riddle;
    private RiddleService riddleService;
    RiddleRepository riddleRepository;

    SessionFactory sessionFactory;

    @BeforeEach
    void setUp() {
        riddleRepository = Mockito.mock(RiddleRepository.class);
        riddleService = new RiddleService(riddleRepository, sessionFactory);
        //riddle = new Riddle();
    }

    @Test
    void testCreateRiddle() throws RepositoryException {

        String question = "What has keys but can't open locks?";
        String expectedAnswer = "A piano";
        String actualAnswer = "A piano";
        Mockito.when(riddleRepository.create(Mockito.any(Riddle.class))).thenAnswer(invocation -> invocation.getArgument(0));

        boolean result = riddleService.creatRiddle(question, expectedAnswer, actualAnswer);

        Assertions.assertTrue(result);
        Mockito.verify(riddleRepository, Mockito.times(1)).create(Mockito.any(Riddle.class));

    }



    @Test
    void testCreateRiddleWithException() throws RepositoryException {
        // Arrange
        String question = "What has keys but can't open locks?";
        String expectedAnswer = "A piano";
        String actualAnswer = "A piano";

        when(sessionFactory.openSession()).thenReturn(mock(Session.class));
        doThrow(new RuntimeException("Simulated repository exception")).when(riddleRepository).create(any(Riddle.class));

        // Act & Assert
        Assertions.assertThrows(RepositoryException.class, () -> riddleService.creatRiddle(question, expectedAnswer, actualAnswer));
        verify(sessionFactory.openSession(), times(1)).close();
    }

    @Test
    void testGetRiddleById() throws RepositoryException {
        Long riddleId = 1L;
        when(sessionFactory.openSession()).thenReturn(mock(Session.class));
        when(riddleRepository.findById(riddleId)).thenReturn(new Riddle());

        Riddle result = riddleService.getRiddleById(riddleId);

        Assertions.assertNotNull(result);
        verify(riddleRepository, times(1)).findById(riddleId);
    }

    @Test
    void testGetRiddleByIdWithException() throws RepositoryException {
        Long riddleId = 1L;
        when(sessionFactory.openSession()).thenReturn(mock(Session.class));
        doThrow(new RuntimeException("Simulated repository exception")).when(riddleRepository).findById(riddleId);

        Assertions.assertThrows(RepositoryException.class, () -> {
            riddleService.getRiddleById(riddleId);
            verify(sessionFactory.openSession(), times(1)).close();
        });
    }




}
