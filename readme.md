# Poker Hand Detector with BDD/Spock
[![Build Status](https://travis-ci.org/groie/PokerhandDojo.svg?branch=master)](https://travis-ci.org/groie/PokerhandDojo)

## Requirements

* Java 8 SDK and $JAVA_HOME environment variable
* Groovy SDK http://groovy-lang.org/install.html

## Running

    ./gradlew clean test
    
# Task

Your task is to get a new Deck from the Deck-class, and recognize the [hand rank](https://en.wikipedia.org/wiki/List_of_poker_hands). 

Simply put, you can ask for a *Deck* from the Deck-class, get five cards from the deck and find out if you have a pair, full house, straight, etc. 

A hand can be obtained with for example a following method:

    Deck.getShuffledDeck();

It can take a while to develop detection for all the possible hands, thus it is a good idea to develop detection for different hands in an incremental manner. You are also allowed to change the classes you cloned.
    
# Testing

Project contains a popular BDD-Testing framework called [Spock](http://spockframework.github.io/spock/docs/1.0/index.html). Spock tests are written in [Groovy](http://groovy-lang.org/) that is a dynamically typed language that works in JVM.

