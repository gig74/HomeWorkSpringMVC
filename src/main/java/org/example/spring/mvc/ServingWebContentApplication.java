package org.example.spring.mvc;

import org.example.spring.mvc.models.Book;
import org.example.spring.mvc.models.BooksStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) {

//        BooksStorage.getBooks().add( new Book("Улисс", "Джеймс Джойс", 1056));
//        BooksStorage.getBooks().add( new Book("Война и мир", "Лев Толстой", 1360));
//        BooksStorage.getBooks().add( new Book("Сага о Форсайтах", "Джон Голсуорси", 1376));

        SpringApplication.run(ServingWebContentApplication.class, args);
    }

}