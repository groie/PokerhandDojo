package ch.bbv.dojo;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by gro on 31/01/16.
 */
public class Deck implements Spliterator<Card> {

    private static List<Card> ALL_CARDS = new ArrayList<>();


    private final List<Card> cards;

    static {
        for (Suite suite : Suite.values()) {
            for (CardValue cardValue : CardValue.values()) {
                ALL_CARDS.add(new Card(suite, cardValue));
            }
        }
    }

    private Deck(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }

    public static Deck getDeck() {
        return new Deck(ALL_CARDS);
    }

    public static Deck getShuffledDeck() {
        return new Deck(ALL_CARDS).shuffle();
    }

    public Deck shuffle() {
        Collections.shuffle(cards);
        return this;
    }

    public int cardsLeftCount() {
        return cards.size();
    }

    public Stream<Card> getCardStream() {
        return StreamSupport.stream(this, false);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deck{");
        for (Card c : cards) {
            sb.append(c.toString());
        }
        return sb.toString();
    }

    @Override
    public boolean tryAdvance(Consumer<? super Card> action) {
        if (cards.isEmpty()) return false;
        Card removedCard = cards.remove(0);
        action.accept(removedCard);
        return true;
    }

    @Override
    public Spliterator<Card> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return cardsLeftCount();
    }

    @Override
    public int characteristics() {
        return 0;
    }

}
