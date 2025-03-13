package com.minas.survive.post.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.validator.constraints.UUID;

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
@Table(name = "tb_post")
@Getter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Post {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NonNull
    @Column(name = "title", length = 50)
    public String title;

    @Column(name = "context", length = 500)
    public String context;

    private Post(
        String title,
        String context
    ) {
        this.title = title;
        this.context = context;
    }

    public static Post of(
        String title,
        String context
    ) {
        return new Post(
            title,
            context
        );
    }
}
