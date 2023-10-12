package de.segoy.springframework.chucknorrisforactuator.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {
    private final ChuckNorrisQuotes quotes;

    public JokesService() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        this.quotes = quotes;
    }

    public String getQuote(){
        return quotes.getRandomQuote();
    }
}
