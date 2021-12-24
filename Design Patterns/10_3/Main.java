public class Main {
    public static void main(String[] args) {
        BrickFactory brickFactory = new BrickFactory();

        Product b1 = brickFactory.factory(BrickType.RectangularBrick, 10);
        Product b2 = brickFactory.factory(BrickType.CircularBrick, 50);
        Product b3 = brickFactory.factory(BrickType.TriangularBrick, 30);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}