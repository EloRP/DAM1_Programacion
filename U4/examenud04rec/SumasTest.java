package examenud04rec;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SumasTest {

    @Test
    void testSumas() {
        int[] arr = {1, -2, 3, -4, 5};
        int[] expected = {3, 9, -6};
        assertArrayEquals(expected, Sumas.sumas(arr));
    }

    @Test
    void testSumasWithNullArray() {
        assertNull(Sumas.sumas(null));
    }

    @Test
    void testSumasWithEmptyArray() {
        int[] arr = {};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, Sumas.sumas(arr));
    }

    void testSumas_NullArray() {
        int[] array = null;
        assertNull(Sumas.sumas(array));
    }

    @Test
    void testSumas_EmptyArray() {
        int[] array = {};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, Sumas.sumas(array));
    }

    @Test
    void testSumas_PositiveAndNegativeNumbers() {
        int[] array = {1, -2, 3, -4, 5};
        int[] expected = {3, 9, -6};
        assertArrayEquals(expected, Sumas.sumas(array));
    }

    @Test
    void testSumas_AllPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {15, 15, 0};
        assertArrayEquals(expected, Sumas.sumas(array));
    }

    @Test
    void testSumas_AllNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int[] expected = {-15, 0, -15};
        assertArrayEquals(expected, Sumas.sumas(array));
    }

    @Test
    void testSumas_PositiveAndZeroNumbers() {
        int[] array = {0, 1, 2, 3};
        int[] expected = {6, 6, 0};
        assertArrayEquals(expected, Sumas.sumas(array));
    }

    @Test
    void testSumas_NegativeAndZeroNumbers() {
        int[] array = {0, -1, -2, -3};
        int[] expected = {-6, 0, -6};
        assertArrayEquals(expected, Sumas.sumas(array));
    }

    @Test
    void testSumas_OneElementArray() {
        int[] array = {5};
        int[] expected = {5, 5, 0};
        assertArrayEquals(expected, Sumas.sumas(array));
    }

    @Test
    void testSumas_LargeNumbers() {
        int[] array = {1000000, -2000000, 3000000};
        int[] expected = {2000000, 4000000, -2000000};
        assertArrayEquals(expected, Sumas.sumas(array));
    }

    
}
