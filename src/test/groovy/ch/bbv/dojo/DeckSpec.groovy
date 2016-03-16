package ch.bbv.dojo

import spock.lang.Specification

/**
 * Created by gro on 16/03/16.
 */
class DeckSpec extends Specification {

    def "foobar"() {
        expect: Deck.deck.cardsLeftCount() == 52

    }
}
