package com.strgzr.rfidlib.model.book;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "books_seq")
    @Column(name = "id")
    private int id;
    @Column(name = "rfid_code", unique = true)
    private String rfidCode;
    @Column(name = "title")
    private String title;
    @Column(name = "rating")
    private int rating;
    @Column(name = "author")
    @OneToMany
    private List<Author> author;
    @Column(name = "categories")
    private String categories;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "year")
    private int year;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;
    @Column(name = "language")
    private String language;
    @Column(name = "pages")
    private int pages;
    @Column(name = "is_ebook")
    private int isEbook;
}
