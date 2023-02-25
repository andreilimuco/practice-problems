package analysis;

public class Analysis {
    public static void main(String[] args) {
        Square square = new Square(12);

        /**
         * Side and width has different values.
         *
         * Assuming that we want to have the same values for the two fields, what should
         * we fix in the code to make it right?
         **/
        System.out.println("Side: " + square.side);
        System.out.println("Width: " + square.width);
    }
}

abstract class Shape {
    public int width;

    public Shape() {
        width = getWidth();
    }

    abstract int getWidth();
}

class Square extends Shape {
    public int side;

    public Square(int side) {
        this.side = side;
        super.width = side; //ans not sure
    }

    int getWidth() {
        return side;
    }


}