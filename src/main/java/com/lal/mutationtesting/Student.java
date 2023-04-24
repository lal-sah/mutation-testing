package com.lal.mutationtesting;

import java.util.Objects;

public record Student(Integer id, String firstName, String lastName) {
    public Student {
        Objects.requireNonNull(id);
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
    }
}
