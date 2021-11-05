package com.example.booksellingsystemwithspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseEntity{

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "description", nullable = false, length = 1200)
    private String description;

    @Column(name = "author_name", nullable = false, length = 100)
    private String author;

    @Column(name = "price", nullable = false)
    private Double price;

}
