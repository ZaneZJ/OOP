package L2;

public class HalfText {

    public String halftext(String text) {

        StringBuffer output = new StringBuffer();
        boolean toSkip = true;
        for (int i = 0; i < text.length(); i++) {
            if (!toSkip) {
                output.append(text.charAt(i));
                toSkip = !toSkip;
            } else {
                toSkip = !toSkip;
            }
        }
        return output.toString();

    }

}
