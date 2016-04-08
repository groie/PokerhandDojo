package ch.bbv.dojo.detector

import spock.lang.Specification
import spock.lang.Unroll

import static ch.bbv.dojo.Hand.hand

/**
 * Created by gro on 08/04/16.
 */
class StraightDetectorTest extends Specification {

    @Unroll
    def "#dealtHand should be a straight"() {

        expect:
        new StraightDetector().is(dealtHand)

        where:
        dealtHand << [
                hand("C2", "H3", "H4", "H5", "C6"),
                hand("C6", "H3", "H2", "H5", "C4"),
                hand("C14", "H3", "H2", "H5", "C4"),
                hand("C14", "H10", "H11", "H13", "C12")
                ]

    }

    @Unroll
    def "#dealtHand should not be a straight"() {

        expect:
        !new StraightDetector().is(dealtHand)

        where:
        dealtHand << [
                hand("C2", "H3", "H4", "H5", "C7"),
                hand("C6", "H3", "H14", "H5", "C4"),
                hand("C14", "H10", "H11", "H13", "C9")

        ]
    }
}
