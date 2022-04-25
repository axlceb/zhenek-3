package org.example.h2demo;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@lombok.Data
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Data {

    @Id
    Long id;

    String text;
}
