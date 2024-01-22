package Matriculas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Matriculas_Tests {

    @Test
    public void matriculaValidaDeberiaDevolverTrue() {
        assertTrue(Matriculas.esMatriculaValida("9876XYZ"));
        assertTrue(Matriculas.esMatriculaValida("5678XYZ"));
        assertTrue(Matriculas.esMatriculaValida("1234BBB"));
        assertTrue(Matriculas.esMatriculaValida("9999BBZ"));
        assertTrue(Matriculas.esMatriculaValida("9999BBD"));
        assertTrue(Matriculas.esMatriculaValida("9999ZZZ"));

        assertFalse(Matriculas.esMatriculaValida("1234ABC"));
        assertFalse(Matriculas.esMatriculaValida("1234AEI"));
        assertFalse(Matriculas.esMatriculaValida("ABCD123"));
        assertFalse(Matriculas.esMatriculaValida("1234ÑYZ"));
        assertFalse(Matriculas.esMatriculaValida("123"));
        assertFalse(Matriculas.esMatriculaValida("1234BBBB"));
        assertFalse(Matriculas.esMatriculaValida("12A4BBB"));
        assertFalse(Matriculas.esMatriculaValida("12.4BBB"));
        assertFalse(Matriculas.esMatriculaValida("1234BAB"));
        assertFalse(Matriculas.esMatriculaValida("1234BB."));
        assertFalse(Matriculas.esMatriculaValida("1234B5B"));
        assertFalse(Matriculas.esMatriculaValida("1234BúB"));
        assertFalse(Matriculas.esMatriculaValida("1234BÚB"));
        assertFalse(Matriculas.esMatriculaValida("1234BñB"));
        assertFalse(Matriculas.esMatriculaValida("1234BbB"));

        assertFalse(Matriculas.esMatriculaValida(""));
        assertFalse(Matriculas.esMatriculaValida(null));
    }

    @Test
    public void siguienteMatriculaTest() {
        assertEquals(Matriculas.siguienteMatricula("1234BBB"), "1235BBB");
        assertEquals(Matriculas.siguienteMatricula("9999BBZ"), "0000BCB");
        assertEquals(Matriculas.siguienteMatricula("9999BBD"), "0000BBF");
        assertEquals(Matriculas.siguienteMatricula("9999ZZZ"), "0000BBB");
        assertEquals(Matriculas.siguienteMatricula(""), null);
        assertEquals(Matriculas.siguienteMatricula(null), null);
    }

}
