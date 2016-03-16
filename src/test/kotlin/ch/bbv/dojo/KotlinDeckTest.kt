package ch.bbv.dojo

import org.junit.Assert
import org.junit.Test

/**
 * Created by gro on 16/03/16.
 */
class KotlinJunitDeckTest {
    @Test
    fun testDeckHas52Cards() {
        Assert.assertEquals(52, Deck.getDeck().cardsLeftCount());
    }
}