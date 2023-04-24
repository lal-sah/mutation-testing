package com.lal.mutationtesting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.lal.mutationtesting.StudentService.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    private static final List<Student> STUDENT_TEST_DATA = List.of(
            new Student(101, "Rohan", "Sah"),
            new Student(102, "Shubham", "Sah"),
            new Student(103, "Vijay", "Sah")
    );

    @Test
    void testFindById() {
        assertNull(findById(null, null));
        assertNull(findById(null, 101));
        assertNull(findById(STUDENT_TEST_DATA, 100));
        assertNull(findById(STUDENT_TEST_DATA, null));
        assertEquals(102, findById(STUDENT_TEST_DATA, 102).id());
        assertEquals("Rohan", findById(STUDENT_TEST_DATA, 101).firstName());
    }

    @Test
    void testFindFirstByMatchingName() {
        assertNull(findFirstByMatchingName(null, null));
        assertNull(findFirstByMatchingName(null, "Nikhil"));
        assertNull(findFirstByMatchingName(STUDENT_TEST_DATA, null));
        assertNull(findFirstByMatchingName(STUDENT_TEST_DATA, "Nikhil"));
        assertEquals(102, findFirstByMatchingName(STUDENT_TEST_DATA, "Shubham").id());
    }

    @Test
    void testFindAllByMatchingName() {
        assertEquals(0, findAllByMatchingName(null, null).size());
        assertEquals(0, findAllByMatchingName(STUDENT_TEST_DATA, null).size());
        assertEquals(0, findAllByMatchingName(null, "Sah").size());
        assertEquals(0, findAllByMatchingName(STUDENT_TEST_DATA, "Johnson").size());
        assertEquals(3, findAllByMatchingName(STUDENT_TEST_DATA, "Sah").size());
        assertEquals(1, findAllByMatchingName(STUDENT_TEST_DATA, "Vijay").size());
        assertEquals("Vijay", findAllByMatchingName(STUDENT_TEST_DATA, "Vijay").get(0).firstName());
    }
}