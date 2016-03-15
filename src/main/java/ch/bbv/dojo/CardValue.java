package ch.bbv.dojo;

/**
 * Created by gro on 31/01/16.
 */
public enum CardValue {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

    @Override
    public String toString() {
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
