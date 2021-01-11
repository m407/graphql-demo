package ru.m407.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
  Book findBookById(Integer id);
}
