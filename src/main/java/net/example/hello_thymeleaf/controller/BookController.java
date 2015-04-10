package net.example.hello_thymeleaf.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.example.hello_thymeleaf.domain.model.Book;

@Controller
@RequestMapping(value = "/books")
public class BookController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model) {

        // (1) スコープに String オブジェクトを登録
        model.addAttribute("yourName", "ジャバ本 太郎");

        // (2) スコープに Book オブジェクトを登録
        Book book = new Book(
            "ISBN978-1-9351-8235-1", /* isbn */
            "Spring in Action",      /* title     */
            "Manning Pubns Co"       /* publisher */
        );
        model.addAttribute("book", book);

        // (3) スコープに List オブジェクトを登録
        List<Book> books = Arrays.asList(
            new Book("ISBN978-1-9351-8235-1", "Spring in Action", "Manning Pubns Co"),
            new Book("ISBN978-1-4302-4107-2", "Pro Spring", "Apress")
        );
        model.addAttribute("books", books);

        // WEB-INF/templates/books-index.html を表示する。
        // (参照: spring-mvc.xml の templateResolver 定義)
        return "books-index";
    }
}
