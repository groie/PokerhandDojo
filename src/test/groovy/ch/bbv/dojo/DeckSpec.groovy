package ch.bbv.dojo

import spock.lang.Specification

/**
 * Created by gro on 16/03/16.
 */
class DeckSpec extends Specification {

    def "should have 52 cards in deck"() {
        expect: Deck.deck.cardsLeftCount() == 52

    }
}
