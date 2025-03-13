package com.minas.survive.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "TB_POST")
@AllArgsConstructor(staticName = "of")
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "post_id", unique = true, nullable = false)
  public String id;

  @Column(name = "title")
  public String title;

  @Column(name = "context")
  public String context;
}
