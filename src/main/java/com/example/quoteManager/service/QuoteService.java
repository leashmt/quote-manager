package com.example.quoteManager.service;

import com.example.quoteManager.model.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.quoteManager.repository.QuoteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteService {

    private final QuoteRepository quoteRepository;

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
}