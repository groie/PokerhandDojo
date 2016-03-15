package ch.bbv.dojo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gro on 15/03/16.
 */
public class DeckTest {

    private Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = Deck.getDeck();
    }

    @Test
    public void testDeckHas52Cards() throws Exception {
        assertEquals(deck.cardsLeftCount(), 52);
    }
}