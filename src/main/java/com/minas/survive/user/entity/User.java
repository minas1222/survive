package com.minas.survive.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "tb_user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name="id", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    
    @NonNull
    @Column(name="name", nullable=false)
    public String name;

    @Column(name="age", nullable=false)
    public int age;

    private User(
        String name,
        int age
    ) {
        this.name = name;
        this.age = age;
    }

    public static User of(
        String name,
        int age
    ) {
        return new User(
            name,
            age
        );
    }
}
