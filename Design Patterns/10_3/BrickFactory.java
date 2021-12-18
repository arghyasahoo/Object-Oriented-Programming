public class BrickFactory {
    public Product factory(BrickType brick, int noOfBricks) {
        switch (brick) {
            case RectangularBrick:
                return new RectangularBrick(noOfBricks);
            case TriangularBrick:
                return new TriangularBrick(noOfBricks);
            case CircularBrick:
                return new CircularBrick(noOfBricks);
            default:
                return null;
        }
    }
}
