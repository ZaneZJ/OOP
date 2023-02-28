package L4;

public class Gen<T> {

    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of T is " +
                ob.getClass().getName());
    }

//    returns the number of digits for Integer objects
//    but returns number of characters for String objects.

    void len() {
        int number = 0;
        if (ob instanceof String) {
            number = ((String) ob).length();
            System.out.println("Char count: " + number);
        } else {
//            Counts space as a char as well
            String str = String.valueOf(ob);
            number = str.length();
            System.out.println("Digit count: " + number);
        }
    }

}
