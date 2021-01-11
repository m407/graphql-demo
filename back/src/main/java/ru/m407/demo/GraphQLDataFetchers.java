package ru.m407.demo;

import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;
import ru.m407.demo.jpa.Book;
import ru.m407.demo.jpa.BookRepository;

import java.util.Map;

@Component
public class GraphQLDataFetchers {

    private final BookRepository bookRepository;

    public GraphQLDataFetchers(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public DataFetcher getBookByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            Integer bookId = dataFetchingEnvironment.getArgument("id");
            return this.bookRepository.findBookById(bookId);
        };
    }

    public DataFetcher getAuthorDataFetcher() {
        return dataFetchingEnvironment -> {
            Book book = dataFetchingEnvironment.getSource();
            return book.author;
        };
    }
}
