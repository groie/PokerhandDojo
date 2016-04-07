package ch.bbv.dojo.detector

import ch.bbv.dojo.Card
import ch.bbv.dojo.CardValue
import ch.bbv.dojo.Suite
import spock.lang.Specification

import static ch.bbv.dojo.CardValue.*
import static ch.bbv.dojo.Suite.*

/**
 * Created by gro on 07/04/16.
 */
class PairDetectorTest extends Specification {
    def "Should be a pair"() {
        given:
        def hand = [new Card(CLUBS, TWO), new Card(HEARTS, TWO), new Card(HEARTS, THREE), new Card(HEARTS, FOUR), new Card(CLUBS, ACE)]

        expect:
        new PairDetector().is(hand)
    }

    def "Should not be a pair"() {
        given:
        def hand = [new Card(CLUBS, QUEEN), new Card(HEARTS, TWO), new Card(HEARTS, THREE), new Card(HEARTS, FOUR), new Card(CLUBS, ACE)]

        expect:
        !new PairDetector().is(hand)
    }
}
