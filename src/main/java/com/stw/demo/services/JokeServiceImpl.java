/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stw.demo.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl()
    {
        this.chuckNorrisQuotes= new ChuckNorrisQuotes();
    }    
    
    @Override
    public String getJoke() {
     return chuckNorrisQuotes.getRandomQuote();    
    }
    
}
