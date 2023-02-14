package L2;

public class Reverse {

    public String reverse(String s) {
        StringBuffer result = new StringBuffer();
        for (int k = s.length() -1; k >= 0; k--) {
            result.append(s.charAt(k));
        } //for
        return result.toString();
    } // reverse()

}
