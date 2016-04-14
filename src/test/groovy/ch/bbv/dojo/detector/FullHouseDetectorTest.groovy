package ch.bbv.dojo.detector

import spock.lang.Specification
import spock.lang.Unroll

import static ch.bbv.dojo.Hand.hand

/**
 * Created by gro on 09/04/16.
 */
class FullHouseDetectorTest extends Specification {
    @Unroll
    def "#dealtHand Should be a full house  "() {
        expect:
        new FullHouseDetector(dealtHand).is()

        where:
        dealtHand <<
                [
                        hand("C2", "H2", "S2", "D13", "C13"),
                        hand("S3", "H3", "S2", "D2", "C3")
                ]

    }

    def "Should not be a full house"() {
        given:
        def hand = hand("C12", "D12", "H12", "H7", "C13")

        expect:
        !new FullHouseDetector(hand).is()
    }
}
