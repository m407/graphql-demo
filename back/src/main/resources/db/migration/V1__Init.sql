DROP TABLE IF EXISTS authors;
DROP TABLE IF EXISTS books;

create table authors
(
    id serial not null
        constraint authors_id_pk
            primary key,
    "firstName" text,
    "lastName" text
);

create table books
(
    id serial not null
        constraint books_id_pk
            primary key,
    author_id int
        constraint books_authors_id_fk
            references authors
            on update cascade on delete cascade,
    name TEXT,
    page_count int
);
