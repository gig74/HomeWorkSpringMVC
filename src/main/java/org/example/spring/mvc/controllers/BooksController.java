package org.example.spring.mvc.controllers;

import org.example.spring.mvc.models.BooksStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Collectors;

import static java.lang.String.format;

@Controller
public class BooksController {
    @GetMapping("/books")
    public String books(Model model) {
        model.addAttribute("books", BooksStorage.getBooks());
        return "books";
    }
}
