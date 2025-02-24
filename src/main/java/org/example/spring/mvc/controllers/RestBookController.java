package org.example.spring.mvc.controllers;

import org.example.spring.mvc.models.BooksStorage;
import org.example.spring.mvc.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

import static java.lang.String.format;

@RestController
public class RestBookController {
    @GetMapping("/restbooks")
    public String books() {
        return BooksStorage.getBooks()
                .stream()
                .map(book -> format("%s - %s - %s", book.getName(), book.getAuthor(), book.getPages() ))
                .collect(Collectors.joining("</br>"));
    }
}
