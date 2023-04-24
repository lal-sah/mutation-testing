package com.lal.mutationtesting;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentService {

    public static Student findById(List<Student> students, Integer id) {
        return Optional.ofNullable(students)
                .orElse(Collections.emptyList())
                .stream()
                .filter(student -> student.id() == id)
                .findFirst()
                .orElse(null);
    }

    public static Student findFirstByMatchingName(List<Student> students, String name) {
        return Optional.ofNullable(students)
                .orElse(Collections.emptyList())
                .stream()
                .filter(student -> name != null && (student.firstName().contains(name) || student.lastName().contains(name)))
                .findFirst()
                .orElse(null);
    }

    public static List<Student> findAllByMatchingName(List<Student> students, String name) {
        return Optional.ofNullable(students)
                .orElse(Collections.emptyList())
                .stream()
                .filter(student -> name != null && (student.firstName().contains(name) || student.lastName().contains(name)))
                .collect(Collectors.toList());
    }

}
