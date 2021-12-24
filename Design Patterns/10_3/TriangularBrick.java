public class TriangularBrick implements Product {
    private int quantity;
    private int height;
    private int base;

    public TriangularBrick(int quantity) {
        this.quantity = quantity;
    }

    public void specify(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double computeArea() {
        return 2 * height * base;
    }

    @Override
    public void enlarge(int height, int base) {
        if (height > this.height || this.base > base) {
            this.height = height;
            this.base = base;
        } else {
            System.out.println("[-] New Height and Base is smaller than previous, Use shrink instead");
        }
    }

    @Override
    public void shrink(int height, int base) {
        if (height > this.height || this.base > base) {
            this.height = height;
            this.base = base;
        } else {
            System.out.println("[-] New Height and Base is larger than previous, Use enlarge instead");
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
        return "Brick type : Triangular Brick";
    }
}
