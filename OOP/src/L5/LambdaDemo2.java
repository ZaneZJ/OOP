package L5;

/*
Change the example – the realization of object’s
t function test should be changed
during run time using the lambda expression
(n) -> n > 0;
No other objects except t should be created.
*/

public class LambdaDemo2 {

    public static void main(String args[]) {
        FunctInterface t = (n) -> (n % 2)==0;
        if(t.test(10)) System.out.println("10 is even");
        if(!t.test(9)) System.out.println("9 is not even");

        t = (n) -> n > 0;
        if(t.test(10)) System.out.println("10 is larger than 0");
        if(!t.test(-9)) System.out.println("-9 is smaller than 0");
    }

}
