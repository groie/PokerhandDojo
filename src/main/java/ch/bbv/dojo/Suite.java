package ch.bbv.dojo;

/**
 * Created by gro on 31/01/16.
 */
public enum Suite {
    HEARTS, CLUBS, DIAMONDS, SPADES;

    @Override
    public String toString() {
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
