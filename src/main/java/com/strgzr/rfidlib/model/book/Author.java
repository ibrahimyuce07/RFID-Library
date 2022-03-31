package com.strgzr.rfidlib.model.book;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "author")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_seq")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;


}
