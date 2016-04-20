package ch.bbv.dojo.detector

import spock.lang.Specification
import spock.lang.Unroll

import static ch.bbv.dojo.Hand.hand
import static ch.bbv.dojo.HandRank.*

/**
 * Created by gro on 14/04/16.
 */
class HandMapperSpec extends Specification {

    @Unroll
    def "#dealthand should be a #rank"() {
        expect:
        new HandMapper(dealthand).getRank() == rank

        where:
        dealthand                           | rank
        hand("C2", "C3", "C4", "C5", "C6")  | StraightFlush
        hand("C2", "H2", "S2", "D2", "C6")  | FourOfKind
        hand("C2", "H2", "S2", "D6", "C6")  | FullHouse
        hand("C2", "C3", "C4", "C7", "C13") | Flush
        hand("C2", "C3", "C4", "C5", "D6")  | Straight
        hand("C2", "D2", "C4", "D4", "D6")  | TwoPair
        hand("C2", "D2", "S2", "C5", "D6")  | ThreeOfKind
        hand("C2", "D2", "C4", "C5", "D6")  | Pair
        hand("C2", "C13", "C4", "C5", "D6") | HighCard
    }
}
