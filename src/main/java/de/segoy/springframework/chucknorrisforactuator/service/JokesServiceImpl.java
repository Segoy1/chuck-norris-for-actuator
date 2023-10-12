package de.segoy.springframework.chucknorrisforactuator.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {
    private final ChuckNorrisQuotes quotes;

    public JokesServiceImpl() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        this.quotes = quotes;
    }

    @Override
    public String getQuote(){
        return quotes.getRandomQuote();
    }
}
