package com.example.booksellingsystemwithspringboot.entity;

import com.example.booksellingsystemwithspringboot.Enum.Role;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_users")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User extends BaseEntity {

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;
}
