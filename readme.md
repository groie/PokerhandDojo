# Java interoperability
[![Build Status](https://travis-ci.org/groie/PokerhandDojo.svg?branch=master)](https://travis-ci.org/groie/PokerhandDojo)

## Requirements

* Groovy SDK http://groovy-lang.org/install.html

## Running

    ./gradlew clean test
    
# Task

Your task is to get a new Deck from the Deck-class, and recognize the [hand rank](https://en.wikipedia.org/wiki/List_of_poker_hands). 

Simply put, you can ask for a *Deck* from the Deck-class, get five cards from the deck and find out if you have a pair, full house, straight, etc. 

Deck can be gotten with following method:

    Deck.getShuffledDeck()
    
# Testing

Project contains a popular BDD-Testing framework called [Spock](http://spockframework.github.io/spock/docs/1.0/index.html). Spock tests are written in [Groovy](http://groovy-lang.org/) that is a dynamically typed language that works in JVM.

