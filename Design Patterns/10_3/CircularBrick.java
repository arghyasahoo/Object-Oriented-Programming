public class CircularBrick implements Product {
    private int quantity;
    private int radius;

    public CircularBrick(int quantity) {
        this.quantity = quantity;
    }

    public void specify(int radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void enlarge(int radius) {
        if (radius > this.radius) {
            this.radius = radius;
        } else {
            System.out.println("[-] New Radius is smaller than previous, Use shrink instead");
        }
    }

    @Override
    public void shrink(int radius) {
        if (radius < this.radius) {
            this.radius = radius;
        } else {
            System.out.println("[-] New Radius is larger than previous, Use enlarge instead");
        }
    }

    @Override
    public void enlarge(int x, int y) {
    };

    @Override
    public void shrink(int x, int y) {
    };

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return "Brick type : Circle" +
                "\nRadius : " + radius +
                "\nNumber of Bricks : " + quantity;
    }
}
