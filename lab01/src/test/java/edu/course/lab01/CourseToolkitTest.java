package edu.course.lab01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);
        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);
        assertFalse(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);
        assertTrue(result);
    }

    @Test
    void returnsTrueForTwo() {
        boolean result = CourseToolkit.isPrime(2);
        assertTrue(result);
    }

    @Test
    void returnsTrueForSmallPrime() {
        boolean result = CourseToolkit.isPrime(13);
        assertTrue(result);
    }

    @Test
    void returnsFalseForCompositeNumber() {
        boolean result = CourseToolkit.isPrime(15);
        assertFalse(result);
    }

    @Test
    void returnsTrueForLargePrime() {
        boolean result = CourseToolkit.isPrime(97);
        assertTrue(result);
    }

    @Test
    void returnsTrueForSimplePalindrome() {
        boolean result = CourseToolkit.isPalindrome("level");
        assertTrue(result);
    }

    @Test
    void returnsFalseForNonPalindrome() {
        boolean result = CourseToolkit.isPalindrome("java");
        assertFalse(result);
    }

    @Test
    void isCaseSensitive() {
        boolean result = CourseToolkit.isPalindrome("Level");
        assertFalse(result);
    }

    @Test
    void isPalindromeThrowsExceptionForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.isPalindrome(null);
        });
    }

    @Test
    void computesAverageForPositiveValues() {
        int[] values = {1, 2, 3, 4};
        double result = CourseToolkit.average(values);
        assertEquals(2.5, result, 1e-9);
    }

    @Test
    void computesAverageForNegativeValues() {
        int[] values = {-1, -2, -3};
        double result = CourseToolkit.average(values);
        assertEquals(-2.0, result, 1e-9);
    }

    @Test
    void averageThrowsExceptionForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.average(null);
        });
    }

    @Test
    void returnsMinForPositiveValues() {
        int[] values = {4, 8, 15, 16, 23, 42};
        assertEquals(4, CourseToolkit.min(values));
    }

    @Test
    void returnsMaxForPositiveValues() {
        int[] values = {4, 8, 15, 16, 23, 42};
        assertEquals(42, CourseToolkit.max(values));
    }

    @Test
    void minThrowsExceptionForNullOrEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.min(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            CourseToolkit.min(new int[0]);
        });
    }
}
