package L3;

public class NotInRangeException extends Exception {

    int n;
    int d;
    int l;
    int u;

    NotInRangeException(int i, int j, int k, int z) {
        n = i;
        d = j;
        l = k;
        u = z;
    }

    public String toString() {
        return "Result of " + n + " / " + d + " = " + (n/d) +
                " is an integer outside the interval [" + l + ", " + u + "].";
    }

}
