import java.util.Scanner;

public class Third {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int k1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int k2 = scanner.nextInt();
            int b2 = scanner.nextInt();

            Line line1 = new Line(k1,b1);
            Line line2 = new Line(k2,b2);

            System.out.println(line1.intersection(line2));
        }
}

class Line {
    int k, b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        int xP, yP;
        xP = k - other.k;
        yP = b - other.b;
        if(xP != 0)
            xP = (-1)*yP / xP;
        else if (xP == 0){
            return null;
        }
        yP = xP * k + b;
        Point point = new Point(xP, yP);
        return point;
    }

}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}