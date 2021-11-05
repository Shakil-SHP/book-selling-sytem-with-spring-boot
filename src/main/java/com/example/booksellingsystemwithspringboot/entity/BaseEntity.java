package com.example.booksellingsystemwithspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_time", nullable = false)
    private LocalDateTime updatedAt;


}
