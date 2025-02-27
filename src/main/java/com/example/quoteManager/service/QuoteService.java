package com.example.quoteManager.service;

import com.example.quoteManager.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.quoteManager.repository.QuoteRepository;

import java.util.List;
import java.util.Random;
import java.util.Optional;

@Service
public class QuoteService {

    private final QuoteRepository quoteRepository;
    private final Random random = new Random();

    @Autowired
    public QuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    public Quote getQuoteById(Long id) {
        Optional<Quote> quote = quoteRepository.findById(id);
        return quote.orElseThrow(() -> new RuntimeException("Quote not found"));
    }

    public Quote getRandomQuote() {
        List<Quote> quotes = quoteRepository.findAll();
        if (quotes.isEmpty()) {
            return null;
        }
        return quotes.get(random.nextInt(quotes.size()));
    }
}