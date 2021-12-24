import java.util.*;

public class Main {
    public static void main(String[] args) {
        RandomException re = new RandomException();

        try {
            re.throwRandomException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}