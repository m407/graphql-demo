package ru.m407.demo.jpa;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  @Column
  public String firstName;

  @Column
  public String lastName;
}
