/**
 * Created by Andrzej on 2015-10-17.
 */
public class Pair {

    public double v;
    public Pair next;

    public Pair (double value, Pair n) {
        this.v = value;
        this.next = n;
    }

    public Pair getNext () {
        return next;
    }

    public double getV () {
        return v;
    }
}