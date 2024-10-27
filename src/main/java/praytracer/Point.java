package praytracer;

public class Point extends Tuple{
    Point(double x, double y, double z) {
        super(x, y, z, 1);
    }

    Point(Tuple t) {
        super(t.x, t.y, t.z, 1);
    }
}
