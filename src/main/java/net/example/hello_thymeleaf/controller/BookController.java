package net.example.hello_thymeleaf.controller;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.example.hello_thymeleaf.domain.model.Book;

@Controller
@RequestMapping(value = "/books")
public class BookController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model, @RequestParam("t") Integer tid, @RequestParam("l1") Integer l1, @RequestParam("l2") Integer l2) {

        // (1) スコープに String オブジェクトを登録
        model.addAttribute("yourName", "ジャバ本 太郎");

        // (2) スコープに Book オブジェクトを登録
        Book book = new Book(
            "ISBN978-1-9351-8235-1",       /* isbn */
            "Spring in Action",            /* title     */
            "Manning Pubns Co",            /* publisher */
            Arrays.asList("A", "B", "C")   /* authors */
        );
        model.addAttribute("book", book);

        // (3) スコープに List オブジェクトを登録
        List<String> authors = new ArrayList<String>();
        for (int i = 0; i < l2; i++) {
            authors.add(String.valueOf(i));
        }

        List <Book> books = new ArrayList<Book>();
        for (int i = 0; i < l1; i++) {
            books.add(new Book("ISBN978-1-9351-8235-1", "Spring in Action", "Manning Pubns Co", authors));
        }
        model.addAttribute("books", books);

        // WEB-INF/templates/books-index.html を表示する。
        // (参照: spring-mvc.xml の templateResolver 定義)
        return "books-index-" + tid;
    }
}
