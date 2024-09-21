package String;

public class generic {

    public static void main(String[] args) {
        String str = null;
        // throw new NullPointerException("exception from throw IS PRINTED!");
        try {
            System.out.println("the length of the string is :" + str.length());
        } catch (ArithmeticException e) {
            System.out.println("the exception is :" + e.getMessage());
        } catch (NullPointerException n) {
            System.out.println("null pointer 2nd exception");
        } catch (Exception n) {
            System.out.println("null pointer 2nd exception");
        } finally {
            System.out.println("finally");
        }
    }

}
