public class RectangularBrick implements Product {
    private int quantity;
    private int length;
    private int breadth;

    public RectangularBrick(int quantity) {
        this.quantity = quantity;
    }

    public void specify(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double computeArea() {
        return length * breadth;
    }

    @Override
    public void enlarge(int length, int breadth) {
        if (length > this.length || this.breadth > breadth) {
            this.length = length;
            this.breadth = breadth;
        } else {
            System.err.println("[-] New length and breadth is smaller than previous, Use shrink instead");
        }
    }

    @Override
    public void shrink(int length, int breadth) {
        if (length > this.length || this.breadth > breadth) {
            this.length = length;
            this.breadth = breadth;
        } else {
            System.err.println("[-] New length and breadth is larger than previous, Use enlarge instead");
        }
    }

    @Override
    public void enlarge(int x) {
    };

    @Override
    public void shrink(int x) {
    };

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return "Brick type : Rectangular Brick";
    }
}
