package ch.bbv.dojo.detector

import ch.bbv.dojo.Card
import ch.bbv.dojo.CardValue
import ch.bbv.dojo.Suite
import spock.lang.Specification

import static ch.bbv.dojo.CardValue.*
import static ch.bbv.dojo.Hand.hand
import static ch.bbv.dojo.Suite.*

/**
 * Created by gro on 07/04/16.
 */
class PairDetectorTest extends Specification {
    def "Should be a pair"() {
        given:
        def hand = hand("C2", "H2", "H4", "H7", "C13")

        expect:
        new PairDetector().is(hand)
    }

    def "Should not be a pair"() {
        given:
        def hand = hand("C12", "H2", "H4", "H7", "C13")

        expect:
        !new PairDetector().is(hand)
    }
}
