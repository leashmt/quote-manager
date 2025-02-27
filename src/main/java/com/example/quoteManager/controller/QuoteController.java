package com.example.quoteManager.controller;

import com.example.quoteManager.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.quoteManager.service.QuoteService;

import java.util.List;

@RestController
@RequestMapping("/quote")
@CrossOrigin(origins = "http://localhost:8080")
public class QuoteController {

    private final QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/quotes")
    public List<Quote> getAllQuotes() {
        return quoteService.getAllQuotes();
    }

    @GetMapping("/quote")
    public Quote getQuoteById(@RequestParam Long id) {
        return quoteService.getQuoteById(id);
    }

    @GetMapping("/random")
    public Quote getRandomQuote() {
        return quoteService.getRandomQuote();
    }
}