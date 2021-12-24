public class RandomException {

    int rnumber = (int) Math.random() * (9 - 0 + 1) + 0;

    public void throwRandomException() throws ArithmeticException {
        for (int i = 0; i < 10; i++) {
            if (i == rnumber) {
                throw new ArithmeticException();
            }
        }
    }
}
