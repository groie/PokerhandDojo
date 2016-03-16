package ch.bbv.dojo

import org.junit.Assert
import org.junit.Test

class ScalaDeckTest {

  @Test
  def deckContains52Cards(): Unit = {
    Assert.assertEquals(52, Deck.getDeck.cardsLeftCount())
  }

}
